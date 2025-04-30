# Java Basics: Generics and Serialization/Deserialization

This section covers two important concepts in Java: Generics (for type safety and code reuse) and Serialization/Deserialization (for saving/transferring object data).

## Java Generics

**What are Generics?**

Generics allow you to write code that can work with different data types while providing compile-time type safety. Instead of specifying a concrete type, you use a **type parameter** (often represented by a single uppercase letter like `T` for Type, `E` for Element, `K` for Key, `V` for Value). This lets you create classes, interfaces, and methods that operate on types specified as parameters.

**Why Use Generics?**

1.  **Stronger Type Checks at Compile Time:** Catches errors earlier. If you declare a `List<String>`, the compiler ensures you only add `String` objects to it, preventing runtime errors from trying to use an incompatible type later.
2.  **Elimination of Casts:** Before generics, you often had to cast objects retrieved from collections (like `ArrayList`). Generics make casting unnecessary because the compiler already knows the type.
3.  **Code Reusability:** You can write a generic algorithm or data structure once and use it with many different types.

**Examples:**

1.  **Generic Collections (`ArrayList`):**

    ```java
    // Without Generics (requires casting, less safe)
    ArrayList list = new ArrayList();
    list.add("hello");
    list.add(123); // Allowed, but might cause problems later
    String text = (String) list.get(0); // Explicit cast needed
    // Integer num = (Integer) list.get(0); // Would cause ClassCastException at runtime!

    // With Generics (type-safe, no casting needed)
    ArrayList<String> stringList = new ArrayList<>(); // Only Strings allowed
    stringList.add("hello");
    // stringList.add(123); // COMPILE ERROR! Cannot add an Integer to List<String>
    String textFromList = stringList.get(0); // No cast needed
    ```

2.  **Generic Method:**

    ```java
    public class GenericExample {

        // A generic method to print any type of array
        public static <T> void printArray(T[] inputArray) {
            // Display array elements
            for (T element : inputArray) {
                System.out.printf("%s ", element);
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Create arrays of Integer, Double and Character
            Integer[] intArray = { 1, 2, 3, 4, 5 };
            Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
            Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

            System.out.println("Array integerArray contains:");
            printArray(intArray);   // Pass an Integer array

            System.out..println("\nArray doubleArray contains:");
            printArray(doubleArray); // Pass a Double array

            System.out.println("\nArray characterArray contains:");
            printArray(charArray); // Pass a Character array
        }
    }
    ```

---

## Serialization and Deserialization

**What are they?**

- **Serialization:** The process of converting the state of a Java object into a sequence of bytes (a byte stream) or a specific data format (like JSON or XML). This allows the object's state to be saved to a file, stored in a database, or transmitted over a network.
- **Deserialization:** The reverse process of reconstructing a Java object from a byte stream or data format that was previously produced by serialization.

**Why Use Them?**

1.  **Persistence:** Saving the state of an object to a file or database so it can be restored later, even after the application restarts.
2.  **Communication:** Sending objects across a network (e.g., between a client and server, or between different microservices). This is fundamental in web applications and distributed systems.
3.  **Caching:** Storing frequently used objects in a cache (like Redis) often involves serialization.

**Common Mechanisms:**

1.  **Java's Built-in Serialization (`java.io.Serializable`):**

    - Objects whose classes implement the marker interface `java.io.Serializable` can be serialized/deserialized using `ObjectOutputStream` and `ObjectInputStream`.
    - Produces a binary format specific to Java.
    - Less common now for cross-language communication or web APIs compared to JSON.
    - _Conceptual Example:_
      ```java
      // To serialize: Write object state -> Byte Stream (e.g., to a file)
      // To deserialize: Read Byte Stream (e.g., from a file) -> Recreate object state
      ```

2.  **JSON Serialization (e.g., using Jackson, Gson):**

    - This is **very common** in web development, especially with frameworks like **Spring Boot**.
    - Converts Java objects to/from JSON (JavaScript Object Notation), a human-readable text format widely used for web APIs.
    - Libraries like Jackson handle the mapping between Java object fields and JSON key-value pairs automatically in many cases.
    - _Conceptual Example:_

      ```java
      // Java Object (e.g., User user = new User("Alice", 30);)
      // -> Serialization (using Jackson) ->
      // JSON String: { "name": "Alice", "age": 30 }

      // JSON String: { "name": "Bob", "age": 25 }
      // -> Deserialization (using Jackson) ->
      // Java Object (e.g., User user = new User("Bob", 25);)
      ```

**Relevance to Spring Boot:**

Understanding serialization/deserialization, particularly **JSON serialization**, is crucial for Spring Boot development. You'll constantly deal with converting Java objects (like DTOs - Data Transfer Objects) to JSON for API responses and deserializing incoming JSON requests back into Java objects.

# Java Threads: Basic Concepts

## What is a Thread?

- A **thread** represents a single thread of execution within a program. You can think of it conceptually like a virtual CPU dedicated to executing a sequence of instructions.
- The Java Virtual Machine (JVM) allows a single application to have **multiple threads** running concurrently.

## Concurrency and Parallelism

- Multiple threads allow different parts of your code to be executed seemingly simultaneously (**concurrency**).
- On systems with multiple CPU cores, threads can run truly in **parallel** with the main application thread and each other, performing tasks at the same time.

## Thread Priority

- Each thread in Java has a **priority** level assigned to it.
- Threads with a higher priority are generally given preference for execution time by the thread scheduler compared to threads with a lower priority. (Note: The exact behavior can depend on the operating system's scheduler).

## JVM Execution and Threads

The Java Virtual Machine continues to execute threads until one of the following conditions occurs:

1.  The `exit` method of the `Runtime` class has been called (which forcibly terminates the JVM).
2.  All **user threads** (non-daemon threads) in the application have completed their execution (have "died").

## The "main" Thread

- When a JVM starts up, it creates an initial thread responsible for executing the `main` method of your application.
- This initial thread is commonly referred to as the **"main" thread**.

## The "daemon" Thread

- thread is a low priority thread that runs in the background to perform tasks such as garbage collection.
- JVM terminates itself when all user threads (non-daemon threads) finish their execution.
  **"daemon" thread**.

# Java Multithreading Basics

## What is Multithreading?

- **Multithreading** is the process of executing multiple **threads** (smaller sequences of program execution) simultaneously within a single program.

## Benefits and Characteristics

- **CPU Utilization:** Helps achieve maximum utilization of the CPU by allowing different tasks to run concurrently or in parallel.
- **Independence:** Threads are generally independent. The execution (or pausing) of one thread does not typically affect the execution of other threads.
- **Exception Isolation:** An uncaught exception thrown in one thread will usually terminate only that thread; it will not interrupt other threads in the application unless designed to do so.
- **Responsiveness:** Can keep applications responsive, especially those with GUIs, by performing long-running tasks in background threads.

## Common Use Cases

Multithreading is useful in various scenarios, including:

- Serving multiple clients concurrently (e.g., in web servers or network applications).
- Handling multiple players or complex background processes in games.
- Performing computationally intensive or I/O-bound tasks in parallel when these tasks are mutually independent.

## Creating Threads in Java

There are two primary ways to create a thread in Java:

**1. Extending the `Thread` Class**

- Create a new class that **inherits** from `java.lang.Thread`.
- **Override** the `run()` method in your subclass. The code inside `run()` is what the new thread will execute.
- Create an instance of your subclass and call its `start()` method to begin execution.

_Instantiation Example (from notes):_

```java
  // Assuming MyThread extends Thread and overrides run()
  MyThread thread1 = new MyThread();
  // To actually run: thread1.start();
```

**2. Implementing the `Runnable` Interface**

- Create a new class that implements the `java.lang.Runnable interface`.
- Implement the `run()` method required by the interface. This method contains the code the thread will execute.
- Create an instance of your `Runnable` implementation.
- Create an instance of the `java.lang.Thread` class, passing your `Runnable` object to the `Thread` constructor.
- Call the `start()` method on the `Thread` object.
- Note: This approach is often preferred as it allows your class to extend a different class if needed (Java doesn't support multiple class inheritance) and promotes better separation between the task (`Runnable`) and the execution mechanism (`Thread`).

```java
 // Assuming MyRunnable implements Runnable and implements run()
  MyRunnable runnable1 = new MyRunnable();
  Thread thread2 = new Thread(runnable1);
  // To actually run: thread2.start();
```

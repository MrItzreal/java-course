# Java Variable Scope: Local vs. Instance Variables

Understanding variable scope is essential in Java. Scope defines where a variable can be accessed within your code. This document outlines the difference between local variables and instance variables (often referred to loosely as "global" within a class context).

## Local Variables

- **Definition:** A variable declared **inside** a method (or constructor, or any code block `{}`).
- **Visibility:** Visible and accessible **only** within the specific method (or block) where it is declared. It cannot be seen or used by other methods in the class.
- **Lifetime:** Exists only for the duration of the method's execution. Once the method finishes, the local variable is gone.
- **Passing Data via Arguments:** One way methods can work with data is by receiving it through **arguments (parameters)**. When data (like an object instance or a primitive value) is passed into a method as a parameter, that parameter acts like a local variable within that method. This allows a method to operate on data provided from outside without needing direct access to variables declared elsewhere in the class.

## Instance Variables ("Global" within a Class)

- **Definition:** A variable declared **outside** any method but **within** the class definition itself. (In Java terminology, these are typically called _instance variables_ if non-static, or _class variables_ if static).
- **Visibility:** Visible and accessible to **all** non-static methods and constructors within that specific class.
- **Lifetime:** Exists for the entire lifetime of an object instance created from that class. Each object gets its own copy of instance variables.
- **Accessing Data "Globally" (within the Class):** By declaring variables at the class level (as instance variables), methods within that class can access and modify this data directly **without** needing it to be passed as a parameter to each method. This allows different methods within the same object to share and work with the same data fields "globally" relative to that object instance.

## Summary

- **Local variables** provide temporary storage within a single method and are often used for calculations or holding data passed via parameters.
- **Instance variables** provide storage associated with an object, allowing data to be shared and accessed by multiple methods within that object throughout its lifetime.

# What is Inheritance?

Inheritance is a fundamental concept in Object-Oriented Programming (OOP). It's a mechanism where a new class can acquire, or **inherit**, the properties (fields/attributes) and behaviors (methods) of an existing class.

Think of it like real-world inheritance: you inherit traits from your parents. In Java:

- The existing class providing the properties and methods is called the **superclass** (or parent class).
- The new class that inherits from the superclass is called the **subclass** (or child class).

This creates an **"IS-A" relationship**. For example, if a `Dog` class inherits from an `Animal` class, then a `Dog` IS-A `Animal`.

## How it Works: The `extends` Keyword

Java uses the `extends` keyword in the class declaration to establish an inheritance relationship.

The basic syntax looks like this:

```java
class SuperclassName {
    // Fields and methods common to all subclasses
}

class SubclassName extends SuperclassName {
    // Subclass automatically gets fields and methods from SuperclassName
    // Can also add its own specific fields and methods
}
```

# Java Access Modifiers

Access modifiers in Java determine the visibility and accessibility of classes\*, fields, methods, and constructors. They control where these parts of your code can be accessed from.

_\*Note: Top-level classes (classes not nested inside another) can only be `public` or default (package-private)._

---

## `public`

- **Visibility:** Accessible from **any** other class in **any** package. Least restrictive.
- **Example:**

  ```java
  // File: Animal.java
  public class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
  }
  // File: Main.java
  public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound(); // This works because makeSound() is public
    }
  }
  ```

---

## `protected`

- **Visibility:** Accessible within the **same package** AND by **subclasses** even if they are in different packages.
- **Example:**

  ```java
  // File: Animal.java (in package animals)
  package animals;

  public class Animal {
        protected void eat() {
            System.out.println("Animal eats");
        }
  }

  // File: Dog.java (in package pets)
  package pets;
  import animals.Animal;

  public class Dog extends Animal {
    public void doSomething() {
        eat(); // Works because Dog is a subclass of Animal
    }
  }
  ```

---

## Default (Package-Private)

- **Visibility:** Accessible **only** by classes within the **same package**. This is the default level if no modifier is specified.
- **Example:**

```java
// In package: com.example.core
package com.example.core;

class Configuration { // Default access class
    String settingsFile = "config.properties"; // Default access field

    void loadSettings() { // Default access method
        System.out.println("Loading settings from " + settingsFile);
    }
}
// Configuration class, settingsFile field, and loadSettings() method
// are ONLY accessible by other classes within the com.example.core package.
```

---

## `private`

- **Visibility:** Accessible **only** from within the **declaring class** itself. Most restrictive.
- **Example:**

  ```java
  // File: Animal.java
  public class Animal {
    private void sleep() {
        System.out.println("Animal sleeps");
    }

    public void test() {
        sleep(); // Allowed, because it's within the same class
    }
  }

  // File: Main.java
  public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
  // a.sleep(); Error! sleep() is private and not visible here
    }
  }
  ```

### In Summary:

- `public`: Everywhere.
- `protected`: Same package + Subclasses in different packages.
- `(Default/Package-Private) (no keyword)`: Same package only.
- `private`: Declaring class only.

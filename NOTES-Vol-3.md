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

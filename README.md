# Java Course by Bro Code (Notes)

## Understanding Java Components: JDK, JRE, and JVM

When working with Java, you'll often encounter the terms JDK, JRE, and JVM. Here's what they mean and how they relate:

1.  **JDK (Java Development Kit)**

    - **What it is:** The JDK is a software development kit required to _develop_ Java applications.
    - **What it includes:** It contains all the necessary tools for coding, compiling, debugging, and packaging Java programs. Key tools include:
      - `javac`: The Java compiler.
      - `java`: The launcher for Java applications (also part of the JRE).
      - `jdb`: The Java debugger.
      - `javadoc`: The documentation generator.
    - **Relationship:** The JDK includes the entire JRE.

2.  **JRE (Java Runtime Environment)**

    - **What it is:** The JRE provides the minimum requirements needed to _run_ existing Java applications. If you only want to run Java programs (and not develop them), the JRE is technically all you need.
    - **What it includes:** It bundles the core Java libraries (APIs) and the Java Virtual Machine (JVM).
    - **Relationship:** The JRE includes the JVM.

3.  **JVM (Java Virtual Machine)**
    - **What it is:** The JVM is an abstract computing machine that executes Java bytecode. It acts as the core component that actually runs your Java program.
    - **How it works:** It interprets the compiled Java code (bytecode) and translates it into native machine code for the underlying operating system and hardware.
    - **Key Benefit:** The JVM is what makes Java "platform-independent" (Write Once, Run Anywhere), as there are specific JVM implementations for different operating systems.

**In Summary:**

- You **need the JDK** to **develop** Java applications.
- You **need the JRE** to **run** Java applications.
- The **JVM** is the engine within the JRE that **executes** the code.

**Installation:** When you download and install the JDK, you automatically get the JRE and JVM included. This gives you everything required for both developing and running Java programs.

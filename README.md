# JAVA Documentation

## Table of Contents

1. [Basic Java](#1-basic-java)
   - [Introduction to Java](#11-introduction-to-java)
   - [First Java Application](#12-first-java-application)
     - [Assignment 1: Print User Information](#assigment-1-print-your-information)
   - [Escape sequences](#13-escape-sequences--backslash-characters)
   - [Types of Comments](#14-types-of-comments)
   - [Java program's Phases](#15-java-programs-phases)
   - [Variable & Data types](#16-variable--data-types)
     - [Assignment-2 (Variable and Data type)](#assignment-2-variable-and-data-type)
   - [Format specifiers](#17-format-specifiers)
   - [Getting user inputs](#18-getting-user-input)
   - [Getting user inputs](#18-getting-user-input)

## 1. Basic Java

## Part-2 Java Basics

- Variables & data types
- Format specifiers
- User Input
- Operators -> Arithmetic, Assignment, Unary, Relational, Logical, Bitwise, Conditional
  - calculator programs - area, temperature
  - days to time converter program: 10 days = seconds?
- Control statement

  - conditional control statement: if, else if, else, switch
    - Even/odd program
    - Pass/Fail program
    - valid voter program
    - Positive/Negative/Zero program
    - Digit spelling program
    - Large/small program
    - Leap year program
    - Vowel/Consonant program
    - small/capital letter
    - assignments
  - Loop control statement: for, while, do while
  - Jump control statement: break, continue, return

    - print 1-100 using for, while, do while loop
    - print a-z
    - print 2,4,...100 / even numbers from 1-100
    - print 1,3,...99 / odd numbers from 1-100
    - print sum of 1-n numbers
    - print sum of even numbers from 1-100
    - print sum of odd numbers from 1-100
    - factorial of n
    - series related program: 1+2+3+ ... + n
    - series related program: 1^2+2^2+3^2+ ... + n^2
    - Fibonacci series
    - multiplication table
    - nested related problems
    - prime numbers
    - prime numbers from 1 to n
    - sum of digits
    - reverse a number
    - palindrome number
    - Armstrong number
    - user is valid or not by checking username,password
    - Pattern related program

- Data structure
  - Array
    - introduction to array
    - sum and average
    - maximum and minimum
    - for each in array
    - 2d array
    - array matrix
    - sum of diagonal, upper triangle, lower triangle elements of a matrix
    - array output test
    - array sorting
  - ArrayList
  - LinkedList
  - HashMap
  - HashSet
- String
  - String
  - StringBuffer
  - StringBuilder
- Date & Time

### 1.1 Introduction to Java

- What is Java?
  - Java is a high level; OOP (Object Oriented Programming) language originally developed by sun microsystem but currenly owned by Oracle.
- Why Should we learn Java / Features of Java?
  - Platform Independent - WORA (Write Once Run Anywhere)
  - Object Oriented
  - Support web based application
  - Robust (example - exception handling)
  - Multi-threaded
- What does platform independent means?
  - Test.java -> javac -> Test.class (ByteCode) -> Any JVM in any OS can run the ByteCode
- History of Java
  - C++ was not platform independent and could not support netwrok programming so sun microsystem took a project called "green project" in 1990 to sort out this issue.
  - James Gosling (Father of Java), Patrick Naughton and Mike Sheridan was working in this project.
  - At first it was names as Oak programming language but in 1994 they named it as Java.
  - Java was officially released in 1995.
- Java Certifications
  - ![oracle certification](images/oracle-java-certification-path.jpg)
  - ![oracle certification2](images/Java_Certification_Path.gif)
- Java Versions
  ![java-versions](images/java-versions.png)
- Environment Setup

  - JDK: Java Development Kit is a software development environment used for developinh java applications and applets. It includes Java Runtimne Environment (JRE), an interpreter / loader (java), a compiler (javac), a document generator (javadoc) and other toold needed in java development. Check JDK is installed or not by using this command `java -version` in your terminal
    ![jdk](images/JDK_JRE_JVM-1.jpg)
  - IDE: Integrated Development Environment. An Integrated Development Environment (IDE) is a software application that provides comprehensive tools and features to facilitate software development. Examples of IDE's: Eclipse, NetBeans, Visual Studio Code, JDeveloper, IntelliJ IDEA, Programiz Java Compiler. Here are some reasons why developers use IDEs:

    1. Code Editing: IDEs offer advanced code editing capabilities such as syntax highlighting, code completion, and error checking. These features help developers write code more efficiently and with fewer mistakes.

    2. Debugging: IDEs provide debugging tools that allow developers to step through their code, set breakpoints, and inspect variables. Debugging tools help identify and fix issues in the code during development.

    3. Build and Compilation: IDEs integrate with build systems and compilers, making it easier to build, compile, and run the code. They can automate repetitive tasks such as compiling, packaging, and deploying the application.

    4. Project Management: IDEs provide project management features that help organize and manage code files, libraries, and resources. They offer features like code navigation, search, and refactoring tools, making it easier to work with large codebases.

    5. Version Control Integration: IDEs often have built-in support for version control systems like Git. They provide features to commit, update, and manage code changes, making collaboration with other developers smoother.

    6. Code Templates and Snippets: IDEs offer code templates and snippets that help speed up development by providing predefined code structures or commonly used code snippets.

    7. Testing and Profiling: IDEs may include tools for writing and running tests, as well as performance profiling to identify bottlenecks in the code and optimize performance.

    8. Integration with Frameworks and Libraries: Many IDEs provide integration with popular frameworks and libraries, offering features like code generation, automated configuration, and easy access to documentation.

### 1.2 First Java Application

- File Extension .java
- Every java application must have a class. class name must start with a capital letter.
- A package is a folder which holds collection of classes and interfaces. package names are typically written in lowercase letters.

```java

// A program to print your info
// Understand the program flow
// keywords in Java - Keywords are reserved words and also in small letters
// How to create a class, function
// How to print in Java - use System.out.Println() or print()
// what is string? printing string in quotation
// printing numeric value does not require double quotation
class Program1 {
  public static void main(String[] args) {
    System.out.print("Product Infos");
    System.out.println("Product: iphone 14");
    System.out.println("Price: $1300");
    System.out.println("Quantity: 14");
  }
}
```

#### Assigment 1: print your information

### 1.3 Escape sequences / Backslash characters

```java
// Escape sequence - a special character followed by backslash. sometimes it is called as backshalsh character
// example -> \b, \t, \n, \", \', \\

class Test {
  public static void main(String[] args) {
    System.out.print("\"Product Infos\"\n");
    System.out.println("Product:\t iphone 14");
    System.out.println("Price:\t\t $1300");
    System.out.println("Quantity:\t 14");
  }
}
```

### 1.4 Types of Comments

- Comments are used to add explanatory notes or annotations within the source code. It is good practice to add meaningful comments to your code to enhance its understandability and maintainability. Comments can help you and other developers understand the purpose of the code, clarify complex logic, or provide reminders for future modifications.
  Java supports three types of comments:

  1. Single-line comments: Single-line comments begin with two forward slashes (`//`) and extend to the end of the line. They are used for short comments or explanations on a single line.

  ```java
  // This is a single-line comment
  int age = 25; // Variable representing the age
  ```

  2. Multi-line comments: Multi-line comments, also known as block comments, begin with a forward slash followed by an asterisk (`/*`) and end with an asterisk followed by a forward slash (`*/`). They can span multiple lines and are often used for longer explanations or comment blocks.

  ```java
  /*
  This is a multi-line comment
  It can span multiple lines
  Used for longer explanations or comment blocks
  */
  ```

  3. Javadoc comments: Javadoc comments are a special type of comment used for generating documentation from the source code. They begin with a forward slash followed by two asterisks (`/**`) and end with an asterisk followed by a forward slash (`*/`). Javadoc comments are used to describe classes, methods, and fields and can include tags for specifying parameters, return values, exceptions, and more.

  ```java
  /**
    * This is a Javadoc comment.
    * It can be used to generate documentation.
    * @param name the name of the person
    * @return a greeting message
    */
  public String greet(String name) {
      return "Hello, " + name + "!";
  }
  ```

### 1.5 Java program's Phases

- Edit -> Compile -> Load -> Verify -> Execute
  ![java-compilation-process](images/java-compilation-process.jpeg)

### 1.6 Variable & Data types

- A variable is a container for storing data. When declaring variables in Java, there are certain rules and conventions to follow. syntax: data-type variable-name;
  Here are the key rules for variable declarations:

1. Variable Names:

   - Must start with a letter, underscore (\_), or dollar sign ($).
   - Can include letters, digits, underscores, and dollar signs.
   - Cannot be a reserved word (e.g., keywords like "int", "class", "public").
   - Follow camelCase convention (start with a lowercase letter, capitalize each subsequent word).

2. Variable Types:
   ![data type](images/datatypesinjava.png)
   ![memory size for data types](images/memory-size.jpeg)
   ![primtive-non-primitive](images/primitive-reference-type.jpeg)
3. Initialization:

   - Variables can be initialized at the time of declaration or later in the code.
   - Uninitialized local variables cannot be used until they are assigned a value.

4. Scope:

   - Variables have different scopes, such as local scope, method scope, or class scope.
   - Local variables are declared within a block of code and are only accessible within that block.
   - Class variables (also known as static variables) are shared across instances of a class.
   - Instance variables belong to a specific instance of a class.

5. Constants:

   - Constants are declared using the `final` keyword to indicate that their value cannot be changed.
   - Constant variable names are typically written in uppercase with underscores for word separation (e.g., final int MAX_VALUE = 100).

6. Naming Conventions:

   - Use meaningful and descriptive names for variables.
   - Follow camelCase convention for variable names (e.g., firstName, numItems).
   - Avoid using single-character variable names (except for loop counters or temporary variables).
   - Choose names that are easy to understand and maintain.

7. Declaration and Assignment:
   - Declare variables before using them in the code.
   - Variables should be assigned values appropriate to their data type.
   - Variables can be assigned new values using the assignment operator (=).

Here's an example that illustrates these rules:

```java
class Test {
  public static void main(String[] args) {
    String productName = "iphone 14";
    double productPrice = 1300;
    int productQuantity = 14;
    final double PRODUCT_DISCOUNT = 10.133;
    System.out.println("Product Infos");
    System.out.println("Product:  " + productName);
    System.out.println("Price: $" + productPrice);
    System.out.println("Quantity: " + productQuantity);
    System.out.println("Discount: " + PRODUCT_DISCOUNT);
  }
}

/*
 * Learning outcomes
 * variable declaration
 * variable initalization
 * dynamic initialization
 * data types
 */
public class Program4 {
  public static void main(String[] args) {

    // declaring variables for a student
    String name;
    int id, age;
    double gpa;
    boolean isRegisted;

    // initializing variables for a student
    name = "Anisul Islam";
    id = 1302020017;
    age = 25;
    gpa = 3.92;
    isRegisted = true;

    // printing variables
    System.out.println("Student Information");
    System.out.println("--------------------");
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Age: "+age);
    System.out.println("GPA: "+gpa);
    System.out.println("Registered: "+isRegisted);
  }
}
```

By following these rules and conventions, you can write clean, readable, and maintainable code in Java.

#### Assignment-2 (Variable and Data type)

```java
  /*
  * Assignment-2 (Variable and Data type)
  * step 1: create a class called Product
  * step 2: create a main method
  * step 3: declare variables: id, title, price, description, category
  * step 4: assign the following data in main method
  101,iphone15,1895 euros,perfect product with best image quality, phone,
  * step 5: print the data
*/
```

### 1.7 Format specifiers

- Format specifiers in Java are used to control the formatting of values when outputting them using methods like System.out.printf() or String.format(). They provide a way to specify how a value should be displayed, including its width, precision, alignment, and data type.

```java
/*
 * Learning outcomes
 * format specifiers
 */
public class Program5 {
  public static void main(String[] args) {

    // declaring variables for a student
    String name;
    int id, age;
    double gpa;
    boolean isRegisted;

    // initializing variables for a student
    name = "Anisul Islam";
    id = 1302020017;
    age = 25;
    gpa = 3.92;
    isRegisted = true;

    // printing variables
    System.out.println("Student Information");
    System.out.println("--------------------");
    System.out.printf("Name: "+name);
    System.out.printf("Name: %s\n",name);
    System.out.printf("ID : %d: \n",id);
    System.out.printf("Age: %d\n",age);
    System.out.printf("GPA: %.2f\n",gpa);
    System.out.printf("Registered: %b\n",isRegisted);
  }
}
```

### 1.8 Getting User Input

```java
import java.util.Scanner;

class Test {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      // String productName = input.next(); // does not count anything after space
      System.out.print("Enter Product Name: ");
      String productName = input.nextLine();

      System.out.print("Enter Product Price: ");
      double productPrice = input.nextDouble();

      System.out.print("Enter Product Quantity: ");
      int productQuantity = input.nextInt();

      final double PRODUCT_DISCOUNT = 10.133;
      System.out.println("Product Infos");
      System.out.println("Product:  " + productName);
      System.out.println("Price: $" + productPrice);
      System.out.println("Quantity: " + productQuantity);
      System.out.println("Discount: " + PRODUCT_DISCOUNT);
    }
  }
}
```

### 1.9 Format specifiers

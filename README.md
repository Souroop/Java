METHOD OVERLOADING:
This java program demonstrates method overloading- a core concept in object oriented programmming (OOPs) where multipe methods share the same name but differ in the number or type of parameters.
The class Sum contains three overloaded sum() i.e methods :
  * One that takes two integers 
  * One that takes three integers 
  * One that takes two double values
    
The Method_overloading class contains the main() (i.e the main method),which creates an instance of Sum and calls the different overloaded methods to showcase how Java resolves which method to call based on the arguments provided.  

INHERITANCE:
This java program ilustrates the concept of inheritance, where a subclass inherits the properties and methods of a superclass.In this case, the Manager class inherits from the Employee class.
 * Employee class defines common attributes like name and salary
 * Manager class extends the Employee class and adds a new attribute department.
 * The program demonstrates how the subclass can call methods from the superclass using the super keyword

METHOD OVERRIDING:
This java program demonstrates the concept of method overriding in Object Oriented Programming (OOPs) using inheritance.It defines a superclass with a method that is overriden by a subclass to provide a specific implementation.
 * A superclass defines a method with a general behaviour.
 * A subclass extends the superrclass and overrides that method with a more specific behaviour.
 * At runtime, the overriden method in the subclass is invoked even if the object is referred to      by a superclass reference--showcasing dynamic method dispatch. 

RECURSION:
This java program demonstrates the use of recursion, a technique where a method calls itself to solve smaller instances of a problem. The program showcase a classic example of recursion by calculating the factorial of a given number.
 * The class Recursion contains a factorial(int n) method.
 * The method calculates the factoral of a number recursively.
 * The main method calls this method and prints the result.

INTERFACE:
This program demonstrates the use of interfaces in Java to achieve abstraction and polymorphism. It defines a common contract(an interface) and shows how multiple classes implement that contract with their own behaviour. A driver section then exercises the code to illustrate runtime polymorphism (calling method on the interface reference without knowing the concrete class at compile time).

EXCEPTION HANDLING:
This java program demonstrates how to handle runtime exceptions using try-catch blocks. Specifically, it showscases how to handle an ArrayIndexOutOfBoundsException when accessing elements outside the bounds of an array.
 Important Concepts:
 * ArrayIndexOutOfBoundsException: Thrown when attempting to access an array index that does not    exist.
 * NullPointerException: Demonstrates a second exception type(though not triggered in this code).
 * Try-Catch Blocks: Used to catch and handle the exception at runtime, ensuring the program        does not crash

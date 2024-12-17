package fundamental;

// java.util is a package
// Scanner is a class of the java.util package
import java.util.Scanner;
// import java.util.*;

// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other functionality

// Access Modifiers
// For classes, you can use either public or default:
// public: The class is accessible by any other class
// default: The class is only accessible by classes in the same package.

// For attributes, methods and constructors:
// public: The code is accessible for all classes
// private: The code is only accessible within the declared class
// protected: The code is accessible in the same package and subclasses. 
// default: The code is only accessible in the same package.

// Non-Access Modifiers
// For classes, you can use either final or abstract:
// final: The class cannot be inherited by other classes 
// abstract: The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.

// For attributes, methods
// final: Attributes and methods cannot be overridden/modified
// static: Attributes and methods belongs to the class, rather than an object
// abstract: Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
// transient: Attributes and methods are skipped when serializing the object containing them
// synchronized: Methods can only be accessed by one thread at a time
// volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"

public class Main {

  // If you don't want the ability to override existing values
  // Declare the attribute as final
  // final int x = 5;
  int x;

  // static method can be accessed without creating an object of the class
  // public can only be accessed by objects


  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // A constructor in Java is a special method that is used to initialize objects.
  // the constructor name must match the class name
  // it cannot have a return type
  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj1 = new Main(5); // Object 1
    Main myObj2 = new Main(5); // Object 2
    myObj1.x = 25;
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);

    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(5); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object

    Scanner myObj3 = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj3.nextLine();
    System.out.println("Username is: " + userName);

    Animal myAnimal = new Animal(); // Create a Animal object
    Animal myPig = new Pig(); // Create a Pig object
    Animal myDog = new Dog(); // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();

    DemoClass myObj4 = new DemoClass();
    myObj4.myMethod();
    myObj4.myOtherMethod();
  }
}
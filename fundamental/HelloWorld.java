package fundamental;
// The name of the java file must match the class name.

// Every line of code that runs in Java must be inside a class. 
// A class should always start with an uppercase first letter.
// Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

import javafx.beans.binding.When;

public class HelloWorld {
    // every program must contain the main() method
    // Any code inside the main() method will be executed.

    // With method overloading, multiple methods can have the same name with
    // different parameters:
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static int myMethod(int x, int y) {
        return x + y;
    }

    // two methods that add numbers of different type:
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t);
        System.out.println("hhhh");

        String[] names = {"ABC", "XYZ", "zoo"};
        String s1 = names[1];
        names[1] = "cat";
        System.out.println(s1);

        // Any code inside the main() method will be executed.
        // System.out.println to print stuff to the screen
        System.out.println("Hello World!");
        System.out.println(3 + 3);

        // print() method does not insert a new line at the end of the output:
        System.out.print("Hello World! ");
        System.out.println("I will print on the same line.");

        String name = "John";
        System.out.println(name);
        int myNum;
        myNum = 15;
        myNum = 20; // myNum is now 20
        System.out.println(myNum);

        // final keyword will declare the variable as "final" or "constant", which means
        // unchangeable and read-only
        final int myfinalNum = 15;

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        System.out.println("Hello " + name);

        // use the + character to add a variable to another variable
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // declare more than one variable of the same type,
        int x = 5, y = 6, z = 50;
        // assign the same value to multiple variables in one line
        x = y = z = 50;
        System.out.println(x + y + z);

        // All Java variables must be identified with unique names.
        /*
         * The general rules for naming variables are:
         * Names can contain letters, digits, underscores_, and dollar$ signs
         * Names must begin with a letter
         * Names should start with a lowercase letter, and cannot contain whitespace
         * Names can also begin with $ and _
         * Names are case-sensitive ("myVar" and "myvar" are different variables)
         * Reserved words (like Java keywords, such as int or boolean) cannot be used as
         * names
         */

        // Data types are divided into two groups:
        // Primitive data types - includes byte, short, int, long, float, double,
        // boolean and char
        // Non-primitive data types - such as String, Arrays and Classes

        // A primitive data type specifies the size and type of variable values, and it
        // has no additional methods.

        // `Long` used when `int` is not large enough to store the value.
        // Note that you should end the value with an "L":
        long myNumL = 15000000000L;
        System.out.println(myNumL);

        // you should end the value with an "f" for floats and "d" for doubles:
        float myNumf = 5.75f;
        System.out.println(myNumf);
        double myNumd = 19.99d;
        System.out.println(myNumd);

        // The precision of float is only six or seven decimal digits,
        // while double variables have a precision of about 15 digits.
        // Therefore it is safer to use double for most calculations.

        // A floating point number can also be a scientific number with an "e" to
        // indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false

        // The char data type is used to store a single character.
        // The character must be surrounded by single quotes, like 'A' or 'c':
        // you can use ASCII values to display certain characters:
        char myGrade = 'B';
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // The String data type is used to store a sequence of characters (text).
        // String values must be surrounded by double quotes:
        String greeting = "Hello World";

        // Non-primitive data types are called reference types because they refer to
        // objects.
        // A primitive type has always a value, while non-primitive types can be null.
        // A primitive type starts with a lowercase letter, while non-primitive types
        // starts with an uppercase letter.
        // Non-primitive types can be used to call methods to perform certain
        // operations, while primitive types cannot.

        /*
         * Widening Casting (automatically) - converting a smaller type to a larger type
         * size
         * byte -> short -> char -> int -> long -> float -> double
         * Narrowing Casting (manually) - converting a larger type to a smaller size
         * type
         * double -> float -> long -> int -> char -> short -> byte
         */
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f; // 不加（float）的话输出为0.0
        System.out.println("User's percentage is " + percentage);

        // the length of a string can be found with the length() method:
        String txt = "Hello World";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());

        // The indexOf() method returns the index (the position) of the first occurrence
        // of a specified text in a string (including whitespace):
        System.out.println(txt.indexOf("World"));
        // Java counts positions from zero.

        // concat() method to concatenate two strings
        System.out.println(firstName.concat(lastName));

        // If you add a number and a string, the result will be a string concatenation:
        String x2 = "10";
        int y2 = 20;
        String z2 = x2 + y2; // z will be 1020 (a String)
        System.out.println(z2);

        // he backslash (\) escape character turns special characters into string
        // characters:
        String txt1 = "We are the so-called \"Vikings\" from the north.";
        String txt2 = "It\'s alright.";
        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt1 + txt2 + txt3);

        // The Java Math class has many methods that allows you to perform mathematical
        // tasks on numbers.
        Math.max(5, 10);
        Math.min(5, 10);
        Math.sqrt(64);
        Math.abs(-4.7);
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0
        // (exclusive):
        Math.random();
        int randomNum = (int) (Math.random() * 101); // 0 to 100

        // variable = (condition) ? expressionTrue : expressionFalse;
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // There is also a "for-each" loop, which is used exclusively to loop through
        // elements in an array:
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }

        cars[0] = "Opel";
        System.out.println(cars[0]);

        // To find out how many elements an array has, use the length property:
        System.out.println(cars.length);

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

        // When a parameter is passed to the method, it is called an argument.
        // So, fname is a parameter, while Liam is argument.
        myMethod("Liam");

        int z3 = myMethod(5, 3);
        System.out.println(z3);

        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        // 存在Java double类型的精度缺失问题
    }
}

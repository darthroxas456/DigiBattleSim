// OWEN ROSE <<<<< NAME
import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ThingsForJavaProject {

  public static void doProject() {
    // byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value
    // of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving
    // memory in large arrays, where the memory savings actually matters. They can also be used in
    // place of int where their limits help to clarify your code; the fact that a variable's range
    // is limited can serve as a form of documentation.

    // short: The short data type is a 16-bit signed two's complement integer. It has a minimum
    // value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines
    // apply: you can use a short to save memory in large arrays, in situations where the memory
    // savings actually matters.

    // int: By default, the int data type is a 32-bit signed two's complement integer, which has a
    // minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the
    // int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a
    // maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer.
    // See the section The Number Classes for more information. Static methods like compareUnsigned,
    // divideUnsigned etc have been added to the Integer class to support the arithmetic operations
    // for unsigned integers.

    // long: The long data type is a 64-bit two's complement integer. The signed long has a minimum
    // value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data
    // type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value
    // of 264-1. Use this data type when you need a range of values wider than those provided by
    // int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support
    // arithmetic operations for unsigned long.

    // float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of
    // values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
    // Formats, and Values section of the Java Language Specification. As with the recommendations
    // for byte and short, use a float (instead of double) if you need to save memory in large
    // arrays of floating point numbers. This data type should never be used for precise values,
    // such as currency. For that, you will need to use the java.math.BigDecimal class instead.
    // Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.

    // double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range
    // of values is beyond the scope of this discussion, but is specified in the Floating-Point
    // Types, Formats, and Values section of the Java Language Specification. For decimal values,
    // this data type is generally the default choice. As mentioned above, this data type should
    // never be used for precise values, such as currency.

    // boolean: The boolean data type has only two possible values: true and false. Use this data
    // type for simple flags that track true/false conditions. This data type represents one bit of
    // information, but its "size" isn't something that's precisely defined.

    // char: The char data type is a single 16-bit Unicode character. It has a minimum value of
    // '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

    // Variable: A storage of memory waiting to be declared.

    // Scope: The section of code where a variable can be accessed.

    // Operator Precedence: Several operations occur in an expression, each part is evaluated and
    // resolved in a predetermined order

    // dataType variableName = (dataType)variableToConvert; this is a form of casting.
    // Casting is when you have a bigger form of code and want to make the memory required for it
    // smaller.
    double dti = 25.4;
    int itd = (int) dti;
    // System.out.println(num2) <-- this is what you use to print the new int from the old double.
    System.out.println(itd);

    compareStrings();
  }



  public static void compareStrings() {


    Scanner sc = new Scanner(System.in);

    String a = "hello";
    String b = "world";

    String A = sc.next();
    String B = sc.next();
    // the string method used below is the addition method which adds all the characters of two
    // strings together.
    System.out.println(A.length() + B.length());
    // the string method used below is the compareTo method which compares one sting to another.
    System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
    // the string method below is the toUpperCase method which is used to set certain characters to
    // capital letters.
    System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " "
        + B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
    // The sting below contains the "==" token which is used in Boolean to see is one sting is equal
    // the other.
     System.out.println(A.compareTo(B)>0 == B.compareTo(A)>0? "Yes":"No");
  }


  // header and parameter listed below.
  public void area() {
    double length = 5.0;
    double width = 2.5;
    System.out.println(calculateArea(length, width));
  }

  // method call and argument is listed below: calculateArea=call (double side1, double
  // side2)=argument.
  public double calculateArea(double side1, double side2) {
    double area;
    area = side1 * side2;
    return area;
    // ^^^^^created methods with arguments and return values above^^^^^.
  }



  public void randomizer() {
    // the random class is used below.
    Random randomGen = new Random();
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
  }
}


class Beta {
  public void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Tell me the size of your slice and I will tell");
    System.out.println("you which is larger, the number entered, or PI");
    double slice = scan.nextDouble();
    // output the larger value, slice or PI
    System.out.println(java.lang.Math.max(Math.PI, slice));


  }



}


class Solution2 {
  // final is used below
  private final Scanner scanner = new Scanner(System.in);

  public void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    if (N % 2 == 0) {
      if (2 <= N && N <= 5) {
        System.out.println("Not Weird");
      } else if (N > 20) {
        System.out.println("Not Weird");
      } else if (6 <= N && N <= 20) {
        System.out.println("Weird");
      }
    } else {
      System.out.println("Weird");
    }

    scanner.close();
  }

  public static void sStatment(){
  
      //switch statement used below.      
      switch (true) {
          case 'a, e, i, o, u'.includes(s[0]):
              letter = 'A';
          break;
          
          case 'b, c, d, f, g'.includes(s[0]):
              letter = 'B';
          break;

          case 'h, j, k, l, m'.includes(s[0]):
              letter = 'C'
          break;

          case 'n, p, q, r, s, t, v, w, x, y, z'.includes(s[0]):
              letter = 'D'
          break;
      }
      return letter;
  }
}


class ComparisonDemo {

  public void main(String[] args) {
    // relational and conditional operators were used below.
    int value1 = 1;
    int value2 = 2;
    if (value1 == value2)
      System.out.println("value1 == value2");
    if (value1 != value2)
      System.out.println("value1 != value2");
    if (value1 > value2)
      System.out.println("value1 > value2");
    if (value1 < value2)
      System.out.println("value1 < value2");
    if (value1 <= value2)
      System.out.println("value1 <= value2");
  }
}


class cost {
  // used operators such as '*' '/' and '+'.
  void solve(double meal_cost, int tip_percent, int tax_percent) {

    double tip_amount = meal_cost * tip_percent / 100;

    double tax_amount = meal_cost * tax_percent / 100;

    double TotalCost = meal_cost + tip_amount + tax_amount;



    System.out.println(Math.round(TotalCost));
  }

  private final Scanner scanner = new Scanner(System.in);

  public void price(){
    double meal_cost = scanner.nextDouble();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int tip_percent = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int tax_percent = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    solve(meal_cost, tip_percent, tax_percent);

    scanner.close();
  }


public static void loop(){
    int continueProgram = 1;
    Scanner scanner = new Scanner(System.in);
    // WHILE LOOP CREATED BELOW VVV

    while (continueProgram == 1) {
      // your program
      System.out.println("Press 1 to continue or 2 to quit.");
      continueProgram = scanner.nextInt();
      scanner.close();
    }
  }


// use of the FOR loop.
public static void forLoop() {
   for(int i= 0; i <= 10; i = i++) {
       System.out.println("For loop was used.");
       System.out.println(i);
   }

 }

  // Do/While loop used below.

  public static void doWHile() {

    int value;

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("enter a number between 1 and 10.");
      value = scanner.nextInt();
    } while (value < 1 || value > 10);
    // if while is true DO repeats.
    System.out.println("you have entered a valid number.");
    scanner.close();
  }
}

class Main {
  public static void main(String[] args) {
      MightyByte myByte = new MightyByte("00000101");
      System.out.println(myByte.getDecimalValue());
    
  }
}

class MightyByte {
    public String bits;
    
    // CONSTRUCTOR IS BELOW VVVV
    
    public MightyByte(String bit){
      bits = bit;
    }
    
    public int getDecimalValue() {
        int decimalValue = 0;
        int intValue;
        int power = 7;
        for (int i = 0; i < bits.length(); i++)
        {
          
            char c = bits.charAt(i); // get the character at position i in string bits 
            intValue = Character.getNumericValue(c);
            decimalValue += intValue * Math.pow(2, power);
            power = power - 1;
        }
        return decimalValue;
    }
     
}

// INHERITANCE: 
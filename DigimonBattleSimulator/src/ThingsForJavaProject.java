// OWEN ROSE <<<<< NAME
/*
 * THIS IS THE LIST OF THINGS WHAT I DID NOT GET CREDIT FOR FOR THE INTEGRATION PROJECT PART 2: 1.
 * Use break and continue with comments describing what they do: CODE LINE IS 180-197 IN THE THINGS
 * FOR JAVA PROJECT FILE.
 * 
 * 2. Overload a method: CODE LINES ARE 27-43 & 56-70 IN THE DBS MAIN FOLDER, THE CONSTRUTORS ARE IN
 * THE FRIENDLY AND ENEMY DATA FOLDERS.
 * 
 * 3. Develop code that makes use of polymorphism: CODE LINES ARE 337-398 IN THE THINGS FOR JAVA
 * PROJECT FOLDER.
 * 
 * 4. Find the smallest value in an array: CODE LINES ARE 401-407 IN THINGS FOR JAVA PROJECT FOLDER
 * 
 * 5. Search an array and identify the index where a value was found: CODE LINES ARE 401-407 IN
 * THINGS FOR JAVA PROJECT FOLDER
 * 
 * 6. Search a two-dimensional array and identify the coordinates where a value was found: CODE
 * LINES ARE 409-413 IN THINGS FOR JAVA PROJECT FOLDER
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

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
    System.out
        .println("The next line is taking a double input,25.4 and changing it to an integer, 25.");
    System.out.println(itd);

  }



  public static void compareStrings() {

    String a = "hello";
    String b = "world";


    // the string method used below is the addition method which adds all the characters of two
    // strings together.
    System.out.println("\n " + "sting a: " + a + "\n " + "string b: " + b);
    System.out.println(
        "\n " + "This next line of code combines the string output of sting a and sting b.");
    System.out.println(a.length() + b.length());
    // the string method used below is the compareTo method which compares one sting to another.
    System.out.println("\n " + "this next line compares string a to string b.");
    System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
    // the string method below is the toUpperCase method which is used to set certain characters to
    // capital letters.
    System.out
        .println("\n " + "this next line uppercases the first letters of both string a and b.");
    System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1, a.length()) + " "
        + b.substring(0, 1).toUpperCase() + b.substring(1, b.length()));
    // The sting below contains the "==" token which is used in Boolean to see is one sting is equal
    // the other.
    System.out.println("\n "
        + "this next line tests to see if the comparison of a to b is the same as the comparison b to a.");
    System.out.println(a.compareTo(b) > 0 == b.compareTo(a) > 0 ? "Yes" : "No");

  }


  // header and parameter listed below.
  public static void area() {
    double length = 5.0;
    double width = 2.5;
    System.out.println("\n "
        + "this line calculates the area of a rectangle with the length of 5 and the width of 2.5.");
    System.out.println(calculateArea(length, width));
  }

  // method call and argument is listed below: calculateArea=call (double side1, double
  // side2)=argument.
  public static double calculateArea(double side1, double side2) {
    double area;
    area = side1 * side2;
    return area;
    // ^^^^^created methods with arguments and return values above^^^^^.
  }



  public static void randomizer() {
    // the random class is used below.
    Random randomGen = new Random();
    System.out
        .println("\n " + "The next 6 lines are random numbers generated by the random generater.");
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
    System.out.println(randomGen.nextInt(54));
  }
}


class Beta {
  public static void math() {


    System.out.println("\n "
        + "The next line will use the java.lang.math package to see if the number 2.25 is larger or smaller than pi.");
    double slice = 2.25;
    // output the larger value, slice or PI
    System.out.println(java.lang.Math.max(Math.PI, slice) + "is larger.");

  }



}


class Solution2 {
  // final is used below
  private static final Scanner scanner = new Scanner(System.in);

  public static void choice() {
    System.out.println("\n " + "please enter a between 1 and 25.");
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
    int value;
    do {
      System.out.println("enter a number between 1 and 10.");
      value = scanner.nextInt();
    } while (value < 1 || value > 10);
    // if while is true DO repeats.
    System.out.println("you have entered a valid number.");
//copied and used for menu system.
    scanner.close();
  }
/*
  public static void switchStatment(){
  
      //switch statement used below.    
      //BREAK USED BELOW: CAUSES THE PROGRAM SKIP TO THE END OF THE SWITCH AND CONTINUE.
      //CONTINUES USED BELOW: CAUSES THE PROGRAM TO CONTINUE THOUGH THE SWITCH UNTIL THE END IS REACHED.
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
          continue;
      }
      return letter;
  }
  */
}


class ComparisonDemo {

  public static void compare() {
    // relational and conditional operators were used below.
    System.out.println(
        "\n " + "this next sequence will compare value 1 and value 2 in various different ways.");
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
  public static void solve(double meal_cost, double tip_percent, double tax_percent) {
    System.out.println("\n "
        + "this next line will solve the total cost of a meal with a .5 tip and a .06 tax. Also the meal is $25.99");
    double tip_amount = meal_cost * tip_percent;

    double tax_amount = meal_cost * tax_percent;

    double TotalCost = meal_cost + tip_amount + tax_amount;



    System.out.println(Math.round(TotalCost));
  }

  

  public void price() {
    double meal_cost = 25.99;

    double tip_percent = .5;

    double tax_percent = .06;

    solve(meal_cost, tip_percent, tax_percent);


  }


  public static void loop() {
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
    int i;
    for (i = 0; i <= 10; i++) {
      System.out.println("\n " + "For loop was used.");
      System.out.println(i);
    }

  }

}


class Main {
  public static void binary() {
    System.out.println(" \n"
        + "this next line gets a how many 0s are in the binary code before it hits a 1 in the line: 00000101.");
    MightyByte myByte = new MightyByte("00000101");
    System.out.println(myByte.getDecimalValue());

  }
}


class MightyByte {
  public String bits;

  // CONSTRUCTOR IS BELOW VVVV

  public MightyByte(String bit) {
    bits = bit;
  }

  public int getDecimalValue() {
    int decimalValue = 0;
    int intValue;
    int power = 7;
    for (int i = 0; i < bits.length(); i++) {

      char c = bits.charAt(i); // get the character at position i in string bits
      intValue = Character.getNumericValue(c);
      decimalValue += intValue * Math.pow(2, power);
      power = power - 1;
    }
    return decimalValue;
  }

}

// INHERITANCE: The process where one class acquires the properties (methods and fields) of another.
// With the use of inheritance the information is made manageable in a hierarchical order.


// USE OF POLYMORPHISM BELOW VVVV

class Bicycle {

  // the Bicycle class has three fields
  public int cadence;
  public int gear;
  public int speed;

  // the Bicycle class has one constructor
  public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
  }

  // the Bicycle class has four methods
  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedUp(int increment) {
    speed += increment;
  }

  public void printDescription() {
    System.out.println("\nBike is " + "in gear " + this.gear + " with a cadence of " + this.cadence
        + " and travelling at a speed of " + this.speed + ". ");

  }


  class MountainBike extends Bicycle {
    private String suspension;

    // Spotbugs wants this class below to be static, but that causes errors with the whole thing.
    // leaving it the same since no errors at run time.
    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
      super(startCadence, startSpeed, startGear); // <<<<<<<the SUPER code work is used here <<<<<
      this.setSuspension(suspensionType);
    }

    public String getSuspension() {
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
      this.suspension = suspensionType;
    }

    public void printDescription() {
      super.printDescription();
      System.out.println("The " + "MountainBike has a" + getSuspension() + " suspension.");
    }
  }
}


class App {
  public static void arrays() {
    System.out.println(" \n"
        + "this mext line gets the value saved in the position 0 in a one dimensional array.");
    // (one dimensional array)
    int[] values = {3, 5, 2343};

    System.out.println(values[0]);
    // (prints out 3)
    System.out.println(
        " \n" + "This next line gets the value saved at position 1,1 in a multi dimesional array.");
    // (multi-dimensional array)
    int[][] grid = {{3, 5, 2343}, {2, 4}, {1, 2, 3, 4}};

    System.out.println(grid[1][1]);
    // (prints out 4 from the grid above)
  }
}
// FINDING THE SUM USING AND ACCUMULATOR USED BELOW VVVV


class apples {

  public static void arraySum() {
    System.out.println(" \n"
        + "this next set of code uses an the numbers in an array to added them together and get a sum of the numbers: 1, 2, 3, 4, and 5.");
    int bucky[] = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int counter = 0; counter < bucky.length; counter++) {
      sum += bucky[counter];
    }
    System.out.println(" \n" + "the sum of these numbers is: " + sum);
    // (prints out: The sum of these numbers is: 15)
  }
}


// ARRAY LIST CREATED BELOW VVVV

class pineapple {
  public static void listOfArrays() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    // adding
    numbers.add(10);
    numbers.add(100);
    numbers.add(40);

    // retrieving
    System.out.println("\n this next set of code is multiple different uses of an array list. ");
    System.out.println("Iteration #1: ");
    // (prints out 10)

    System.out.println(numbers.get(0));

    // indexed for loop iteration
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
      // Prints out the numbers above in order
    }

  }
}


class Colony implements Iterable<Colony.Penguin> {
  static class Penguin {
    String name;

    Penguin(String name) {
      this.name = name;
    }

    public String toString() {
      return "Penguin{" + name + "}";
    }
  }

  Set<Penguin> set = new HashSet<Penguin>();

  public void addPenguin(Penguin p) {
    set.add(p);
  }

  public Iterator<Penguin> getPenguins() {
    return set.iterator();
  }

  public Iterator<Penguin> iterator() {
    return getPenguins();
  }

  public static void main(String args[]) {
    Colony colony = new Colony();
    Penguin opus = new Penguin("Opus");
    Penguin chilly = new Penguin("Chilly Willy");
    Penguin mumble = new Penguin("Mumble");
    Penguin emperor = new Penguin("Emperor");
    colony.addPenguin(opus);
    colony.addPenguin(chilly);
    colony.addPenguin(mumble);
    colony.addPenguin(emperor);
    for (Penguin p : colony) {
      System.out.println(p);
    }
  }
}


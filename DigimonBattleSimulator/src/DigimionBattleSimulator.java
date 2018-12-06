// OWEN ROSE
// This program is to be a turn based battle simulator
// where you battle foes to become more powerful.
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import java.util.Scanner;


// GREETING BELOW

// to save everything click save aLL and then right click on the java folder and click delete.
// AS LONG AS YOU SAVED IT WILL NOT REALLY DELETE IT!!!
public class DigimionBattleSimulator {
  private static final Scanner scanner = new Scanner(System.in);

  // Hello, and welcome to the Digimon Battle Simulator by Owen Rose.<--Greeting
  // This program is a turn based battle simulator in the digital monster universe. <--Description
  public static void menu() {
    // escape sequence below (\n)
    System.out.println("Hello, Digital Trainer, \n and welcome to Digimon Battle Simulator!");
    // The string below is a sting to allow the string after it to have 2 acceptable values when
    // run, which is "yes" and "no"
    String[] acceptableValues = {"Yes", "No"};
    // the string below creates a choice box with asks the user if they are ready for their
    // adventure or not.
    String start = // The String "Start" is used here, eclipse for some reason does not pick it up
                   // in source code while running it fine.
        (String) JOptionPane.showInputDialog(null, "Are you ready to start you digital adventure?",
            "Digimon Battle Simulator", 2, null, acceptableValues, acceptableValues[1]);


    // start of FriendlyDigimon data

    // 1 EXP== 1 enemy defeated!

    FriendlyDigimon Agumon = new FriendlyDigimon(5.5, 25, 10, 10, 10, "Male");

    // once EXP = 10 Agumon digivolves into Greymon.

    FriendlyDigimon Greymon = new FriendlyDigimon(25.7, 50, 20, 20, 20, "Male");

    // once EXP = 20 Greymon digivolves into MtlGreymon.

    FriendlyDigimon MtlGreymon = new FriendlyDigimon(30.5, 75, 35, 35, 35, "Male");

    // once EXP = 40 MtlGreymon Digivolves into WarGreymon.

    FriendlyDigimon WarGreymon = new FriendlyDigimon(35.0, 100, 50, 50, 50, "Male");

    // once EXP = 100 WarGreymon digivolves into Omnimon.

    FriendlyDigimon Omnimon = new FriendlyDigimon(50.5, 200, 100, 100, 100, "Male");

    System.out
        .println("\n " + "\n " + " These are the stats for all the partner digimon you can have.");
    System.out.println("\n " + "Agumon's stats: " + Agumon.toString() + "\n " + "\n "
        + "Greymon's stats: " + Greymon.toString() + "\n " + "\n " + "MetalGreymon's stats: "
        + MtlGreymon.toString() + "\n " + "\n " + "WarGreymon's stats: " + WarGreymon.toString()
        + "\n " + "\n " + "Omnimon's stats: " + Omnimon.toString());
    // I WANT TO PRINT THIS (WRITTEN BELOW) AFTER THE DIGITAL TRAINER OBTAINS OMNIMON!!!
    // You have gotten this far. You now are unstoppable.
    // You are unbeatable, no enemy can hold a candle too you.
    // you have beaten 170 enemies, but the world is never truly safe
    // What you do now is up to you.
    // Have fun!



    // start of EnemyDigimon data

    Digimon BlackAgumon = new Digimon(4.6, 20, 8, 16, 6, "Female");

    Digimon Patamon = new Digimon(4.6, 20, 15, 4, 1, "Male");

    Digimon Growlmon = new Digimon(25.7, 45, 20, 15, 7, "Male");

    Digimon Devilmon = new Digimon(25.6, 50, 25, 20, 10, "Male");

    Digimon WarGrowlmon = new Digimon(30.0, 70, 30, 30, 30, "Female");

    Digimon RiseGreymon = new Digimon(30.2, 75, 35, 25, 20, "Female");

    Digimon Gallantmon = new Digimon(36.2, 90, 45, 50, 40, "Male");

    Digimon WarGreymonB = new Digimon(35.0, 100, 50, 50, 51, "Male");

    System.out.println("\n " + "\n "
        + " These are the stats for all the enemy digimon you can encounter in battle.");
    System.out.println("\n " + "BlackAgumon's stats: " + BlackAgumon.toString() + "\n " + "\n "
        + "Patamon's stats: " + Patamon.toString() + "\n " + "\n " + "Growlmon's stats: "
        + Growlmon.toString() + "\n " + "\n " + "Devilmon's stats: " + Devilmon.toString() + "\n "
        + "\n " + "WarGrowlmon's stats: " + WarGrowlmon.toString() + "\n " + "\n "
        + "RiseGreymon's stats: " + RiseGreymon.toString() + "\n " + "\n " + "Gallantmon's stats: "
        + Gallantmon.toString() + "\n " + "\n " + "Black WarGreymon's stats: "
        + WarGreymonB.toString() + "\n " + "\n ");


  }

  // CODE FOR THINGS NEEDED FOR JAVA PROJECT.
  public static void main(String[] args) {
    System.out.println(
        "Please select one of the following items by typing in the number assigned to it.");

    System.out.println("       MEMU:" + "\n " + "1. Item Casting" + "\n " + "2. Comparing Strings"
        + "\n " + "3. Finding Area" + "\n " + "4. Randomizer" + "\n " + "5. Picking a Number"
        + "\n " + "6. Compare Int Values" + "\n " + "7. Solving Meal Prices" + "\n "
        + "8. For Loops" + "\n " + "9. Binary" + "\n " + "0. Arrays" + "\n " + "10. Sum of an Array"
        + "\n " + "11. Array List" + "\n " + "12. Polymorphism" + "\n " + "13. Searching an Array");
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    if (N == 1) {
      ThingsForJavaProject.doProject();
    } else if (N == 2) {
      ThingsForJavaProject.compareStrings();
    } else if (N == 3) {
      ThingsForJavaProject.area();
    } else if (N == 4) {
      ThingsForJavaProject.randomizer();
    } else if (N == 5) {
      Solution2.choice();
    } else if (N == 6) {
      ComparisonDemo.compare();
    } else if (N == 7) {
      cost.solve(25.99, .5, .06);
    } else if (N == 8) {
      cost.forLoop();
    } else if (N == 9) {
      Main.binary();
    } else if (N == 0) {
      App.arrays();
    } else if (N == 10) {
      apples.arraySum();
    } else if (N == 11) {
      pineapple.listOfArrays();
    } else if (N == 12) {
      Polymorphism_HERE.do9();
    } else if (N == 13) {
      Search_Array_For_Value.arrayValue();
    } else if (N == 14) {
      DigimionBattleSimulator.menu();
    } else {
      System.out.println("Try again.");
    }
    System.out.println("Would you like to try another feature?"
        + "\n Press 1 to continue or 2 to end the program.");
    int value;
    do {
      value = scanner.nextInt();
      if (value == 1) {
        System.out.println("Please enter your selection:" + "\n" + "\n" + "       MEMU:" + "\n "
            + "1. Item Casting" + "\n " + "2. Comparing Strings" + "\n " + "3. Finding Area" + "\n "
            + "4. Randomizer" + "\n " + "5. Picking a Number" + "\n " + "6. Compare Int Values"
            + "\n " + "7. Solving Meal Prices" + "\n " + "8. For Loops" + "\n " + "9. Binary"
            + "\n " + "0. Arrays" + "\n " + "10. Sum of an Array" + "\n " + "11. Array List" + "\n "
            + "12. Polymorphism" + "\n " + "13. Searching an Array" + "\n " + "14. Digimon Stats");
        N = scanner.nextInt();
        if (N == 1) {
          ThingsForJavaProject.doProject();
        } else if (N == 2) {
          ThingsForJavaProject.compareStrings();
        } else if (N == 3) {
          ThingsForJavaProject.area();
        } else if (N == 4) {
          ThingsForJavaProject.randomizer();
        } else if (N == 5) {
          Solution2.choice();
        } else if (N == 6) {
          ComparisonDemo.compare();
        } else if (N == 7) {
          cost.solve(25.99, .5, .06);
        } else if (N == 8) {
          cost.forLoop();
        } else if (N == 9) {
          Main.binary();
        } else if (N == 0) {
          App.arrays();
        } else if (N == 10) {
          apples.arraySum();
        } else if (N == 11) {
          pineapple.listOfArrays();
        } else if (N == 12) {
          Polymorphism_HERE.do9();
        } else if (N == 13) {
          Search_Array_For_Value.arrayValue();
        } else if (N == 14) {
          DigimionBattleSimulator.menu();
        } else {
          System.out.println("Try again.");
        }
        System.out.println("Would you like to try another feature?"
            + "\n Press 1 to continue or 2 to end the program.");
      }
    } while (value == 1);
    // if while is true DO repeats.
    System.out.println("Have a good day!!!");
    scanner.close();
  }

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
      System.out.println("\nBike is " + "in gear " + this.gear + " with a cadence of "
          + this.cadence + " and travelling at a speed of " + this.speed + ". ");

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


  class Colony implements Iterable<Colony.Penguin> {
    class Penguin {
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

    public void main() {
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



}

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
import javax.swing.JOptionPane;

// GREETING BELOW

// to save everything click save aLL and then right click on the java folder and click delete.
// AS LONG AS YOU SAVED IT WILL NOT REALLY DELETE IT!!!
public class DigimionBattleSimulator {
  // Hello, and welcome to the Digimon Battle Simulator by Owen Rose.<--Greeting
  // This program is a turn based battle simulator in the digital monster universe. <--Description
  public static void main(String[] args) {
    // escape sequence below (\n)
    System.out.println("Hello, Digital Trainer, \n and welcome to Digimon Battle Simulator!");
    // The string below is a sting to allow the string after it to have 2 acceptable values when
    // run, which is "yes" and "no"
    String[] acceptableValues = {"Yes", "No"};
    // the string below creates a choice box with asks the user if they are ready for their
    // adventure or not.
    String start = //The String "Start" is used here, eclipse for some reason does not pick it up in source code while running it fine.
        (String) JOptionPane.showInputDialog(null, "Are you ready to start you digital adventure?",
            "Digimon Battle Simulator", 2, null, acceptableValues, acceptableValues[1]);


    // start of friendly data

    // 1 EXP== 1 enemy defeated!

    FriendlyDigimon Agumon = new FriendlyDigimon(5.5, 25, 0, 10, 10, 10, "Male");

    // once EXP = 10 Agumon digivolves into Greymon.

    FriendlyDigimon Greymon = new FriendlyDigimon(25.7, 50, 0, 20, 20, 20, "Male");

    // once EXP = 20 Greymon digivolves into MtlGreymon.

    FriendlyDigimon MtlGreymon = new FriendlyDigimon(30.5, 75, 0, 35, 35, 35, "Male");

    // once EXP = 40 MtlGreymon Digivolves into WarGreymon.

    FriendlyDigimon WarGreymon = new FriendlyDigimon(35.0, 100, 0, 50, 50, 50, "Male");

    // once EXP = 100 WarGreymon digivolves into Omnimon.

    FriendlyDigimon Omnimon = new FriendlyDigimon(50.5, 200, 0, 100, 100, 100, "Male");

    System.out.println("\n " + "\n " + " These are the stats for all the partner digimon you can have.");
    System.out.println("\n " + "Agumon's stats: " + Agumon.toString() + "\n " + "\n " + "Greymon's stats: " + Greymon.toString() + "\n "
        + "\n " + "MetalGreymon's stats: " + MtlGreymon.toString() + "\n " + "\n " + "WarGreymon's stats: " + WarGreymon.toString() + "\n "
        + "\n " + "Omnimon's stats: " + Omnimon.toString());
    // I WANT TO PRINT THIS (WRITTEN BELOW) AFTER THE DIGITAL TRAINER OBTAINS OMNIMON!!!
    // You have gotten this far. You now are unstoppable.
    // You are unbeatable, no enemy can hold a candle too you.
    // you have beaten 170 enemies, but the world is never truly safe
    // What you do now is up to you.
    // Have fun!



    // start of enemy data
    Digimon BlackAgumon = new Digimon(4.6, 20, 8, 16, 6, "Female");

    Digimon Patamon = new Digimon(4.6, 20, 15, 4, 1, "Male");

    Digimon Growlmon = new Digimon(25.7, 45, 20, 15, 7, "Male");

    Digimon Devilmon = new Digimon(25.6, 50, 25, 20, 10, "Male");

    Digimon WarGrowlmon = new Digimon(30.0, 70, 30, 30, 30, "Female");

    Digimon RiseGreymon = new Digimon(30.2, 75, 35, 25, 20, "Female");

    Digimon Gallantmon = new Digimon(36.2, 90, 45, 50, 40, "Male");

    Digimon WarGreymonB = new Digimon(35.0, 100, 50, 50, 51, "Male");

    System.out
        .println("\n " + "\n " + " These are the stats for all the enemy digimon you can encounter in battle.");
    System.out.println("\n " + "BlackAgumon's stats: " + BlackAgumon.toString() + "\n " + "\n " + "Patamon's stats: " + Patamon.toString()
        + "\n " + "\n " + "Growlmon's stats: " + Growlmon.toString() + "\n " + "\n " + "Devilmon's stats: " + Devilmon.toString() + "\n "
        + "\n " + "WarGrowlmon's stats: " + WarGrowlmon.toString() + "\n "+ "\n " +"RiseGreymon's stats: " + RiseGreymon.toString()
        + "\n " + "\n " + "Gallantmon's stats: " + Gallantmon.toString() + "\n " + "\n " + "Black WarGreymon's stats: " + WarGreymonB.toString());

    // CODE FOR THINGS NEEDED FOR JAVA PROJECT. COMMENT "//" THEM OUT WHEN NOT IN USE
    // ThingsForJavaProject.doProject();
    // cost.doWHile();
    // cost.forLoop();



  }



}

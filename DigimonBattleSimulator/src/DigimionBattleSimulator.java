//OWEN ROSE
//This program is to be a turn based battle simulator 
//where you battle foes to become more powerful.
import javax.swing.JOptionPane;

//GREETING BELOW

// to save everything click save aLL and then right click on the java folder and click delete. 
// AS LONG AS YOU SAVED IT WILL NOT REALLY DELETE IT!!!
public class DigimionBattleSimulator {
// Hello, and welcome to the Digimon Battle Simulator by Owen Rose.<--Greeting
// This program is a turn based battle simulator in the digital monster universe. <--Description 
	public static void main(String[] args) {
		                                 //escape sequence below (\n)
		System.out.println("Hello, Digital Trainer, \n and welcome to Digimon Battle Simulator!");
				//The string below is a sting to allow the string after it to have 2 acceptable values when run, which is "yes" and "no"
		String[] acceptableValues = { "Yes", "No"};
				//the string below creates a choice box with asks the user if they are ready for their adventure or not.
		String start =  (String)JOptionPane.showInputDialog(null, "Are you ready to start you digital adventure?",
		"Digimon Battle Simulator", 2, null, acceptableValues,acceptableValues[1]);
		
		
//start of friendly data
		
		//1 EXP== 1 enemy defeated!
		
		friendlydata Agumon = new friendlydata(5.5, 25, 0, 10, 10, 10, true);
		
	//once EXP = 10 Agumon digivolves into Greymon.

		friendlydata Greymon = new friendlydata(25.7,50, 0, 20, 20, 20, true);
 
	//once EXP = 20 Greymon digivolves into MtlGreymon.

		friendlydata MtlGreymon = new friendlydata(30.5,75, 0, 35, 35, 35, true);

	//once EXP = 40 MtlGreymon Digivolves into WarGreymon.

		friendlydata WarGreymon = new friendlydata(35.0,100, 0, 50, 50, 50, true);

	//once EXP = 100 WarGreymon digivolves into Omnimon.	

		friendlydata Omnimon = new friendlydata(50.5,200, 0, 100, 100, 100, true);

		
	//I WANT TO PRINT THIS (WRITTEN BELOW) AFTER THE DIGITAL TRAINER OBTAINS OMNIMON!!!
	//You have gotten this far. You now are unstoppable.
	//You are unbeatable, no enemy can hold a candle too you.  
	//you have beaten 170 enemies, but the world is never truly safe 
	//What you do now is up to you.
	//Have fun!
	
		
		
//start of enemy data 		
		enemydata BlackAgumon = new enemydata(4.6, 20, 8, 16, 6, false);

		enemydata Patamon = new enemydata(4.6, 20, 15, 4, 1, true);
		
		enemydata Growlmon = new enemydata(25.7, 45, 20, 15, 7, true);

		enemydata Devilmon = new enemydata(25.6, 50, 25, 20, 10, true);

		enemydata WarGrowlmon = new enemydata(30.0, 70, 30, 30, 30, false);

		enemydata RiseGreymon =  new enemydata(30.2, 75, 35, 25, 20,false); 

		enemydata Gallantmon = new enemydata(36.2, 90, 45, 50, 40,true);

		enemydata WarGreymonB = new enemydata(35.0, 100, 50, 50, 51, true);

		
//CODE FOR THINGS NEEDED FOR JAVA PROJECT. COMMENT "//" THEM OUT WHEN NOT IN USE
		//ThingsForJavaProject.doProject();
		
		
		
		
		
		
		
	}
	
	
	
}

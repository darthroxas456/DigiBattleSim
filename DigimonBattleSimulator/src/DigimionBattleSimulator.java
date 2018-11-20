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
		BlackAgumon.height = 4.6;
		BlackAgumon.gender = false;
		BlackAgumon.HP = 20;
		BlackAgumon.ATK = 8;
		BlackAgumon.DEF = 16;
		BlackAgumon.AGL = 6;
		
		
		enemydata Patamon = new enemydata();
		Patamon.height = 4.6;
		Patamon.gender = true;
		Patamon.HP = 20;
		Patamon.ATK = 15;
		Patamon.DEF = 4;
		Patamon.AGL = 1;
		
		
		enemydata Growlmon = new enemydata();
		Growlmon.height = 25.7;
		Growlmon.gender = true;
		Growlmon.HP = 45;
		Growlmon.ATK = 20;
		Growlmon.DEF = 15;
		Growlmon.AGL = 7;
		
		
		enemydata Devilmon = new enemydata();
		Devilmon.height = 25.6;
		Devilmon.gender = true;
		Devilmon.HP = 50;
		Devilmon.ATK = 25;
		Devilmon.DEF = 20;
		Devilmon.AGL = 10;
		
		
		enemydata WarGrowlmon = new enemydata();
		WarGrowlmon.height = 30.0;
		WarGrowlmon.gender = false;
		WarGrowlmon.HP = 70;
		WarGrowlmon.ATK = 30;
		WarGrowlmon.DEF = 30;
		WarGrowlmon.AGL = 30;
		
		
		enemydata RiseGreymon =  new enemydata(); 
		RiseGreymon.height = 30.2;
		RiseGreymon.gender = false;
		RiseGreymon.HP = 75;
		RiseGreymon.ATK = 35;
		RiseGreymon.DEF = 25;
		RiseGreymon.AGL = 20;
		
		
		enemydata Gallantmon = new enemydata ();
		Gallantmon.height = 36.2;
		Gallantmon.gender = true;
		Gallantmon.HP = 90;
		Gallantmon.ATK = 45;
		Gallantmon.DEF = 50;
		Gallantmon.AGL = 40;
		
		
		enemydata WarGreymonB = new enemydata();
		WarGreymonB.height = 35.0;
		WarGreymonB.gender = true;
		WarGreymonB.HP = 100;
		WarGreymonB.ATK = 50;
		WarGreymonB.DEF = 50;
		WarGreymonB.AGL = 51;
				
		
		
//CODE FOR THINGS NEEDED FOR JAVA PROJECT. COMMENT "//" THEM OUT WHEN NOT IN USE
		//ThingsForJavaProject.doProject();
		
		
		
		
		
		
		
	}
	
	
	
}

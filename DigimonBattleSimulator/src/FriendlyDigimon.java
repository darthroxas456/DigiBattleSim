// OWEN ROSE
// partner data
/**
 * This file is used for obtaining the data used for your partner's stats.
 * 
 * @author Owen Rose
 */
public class FriendlyDigimon extends Digimon {
  /**
   * This class is where all the information that is implemented for the partner digimon in the DBS
   * main is stored using an overloaded constructor.
   */
  public int EXP;



  // OVERLOADED CONSTRUCTOR / CONSTRUCTOR
  /**
   * This is the overloaded constructor that stores all the data for the partner digimon.
   */
  // the error given here by spotbugs if changed causes major errors elsewhere in the project.
  // leaving the same because there is no problem during runtime
  public FriendlyDigimon(double height, int HP, int EXP, int ATK, int AGL, int DEF, String GENDER) {
    super(height, HP, ATK, AGL, DEF, GENDER);
    this.EXP = EXP;


  }
}


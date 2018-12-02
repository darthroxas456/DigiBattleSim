// OWEN ROSE
// partner data
/**
 * This file is used for obtaining the data used for your partner's stats.
 * 
 * @author Owen Rose
 */
public class friendlydata {
  /**
   * This class is where all the information that is implemented for the partner digimon in the DBS
   * main is stored using an overloaded constructor.
   */

  public double height;
  // the variable below is the int variable.
  // It's used to hold none decimal numbers to be called for later use.
  public int HP;

  public int EXP;

  public int ATK;

  public int AGL;

  public int DEF;

  public String GENDER;


  // OVERLOADED CONSTRUCTOR / CONSTRUCTOR
  /**
   * This is the overloaded constructor that stores all the data for the partner digimon.
   */
  // the error given here by spotbugs if changed causes major errors elsewhere in the project.
  // leaving the same because there is no problem during runtime
   public friendlydata(double height, int HP, int EXP, int ATK, int AGL, int DEF, String GENDER) {
    this.height = height;
    this.HP = HP;
    this.EXP = EXP;
    this.ATK = ATK;
    this.AGL = AGL;
    this.DEF = DEF;
    this.GENDER = GENDER;

  }
}


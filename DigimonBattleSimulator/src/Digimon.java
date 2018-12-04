// OWEN ROSE
// enemy data
/**
 * This file is used for obtaining the data used for the enemies' stats.
 * 
 * @author Owen Rose
 */
public class Digimon {
  /**
   * This class is where all the information that is implemented for the enemy digimon in the DBS
   * main is stored using an overloaded constructor.
   */
  public double height;

  public int HP;

  public int ATK;

  public int AGL;

  public int DEF;

  public String GENDER;

  // OVERLOADED CONSTRUCTOR / CONSTRUCTOR
  /**
   * This is the overloaded constructor that stores all the data for the enemy digimon.
   */
  public Digimon(double height, int HP, int ATK, int AGL, int DEF, String GENDER) {
    /*
     * The errors listed here for spotbugs says that the this statements below should all be
     * private, but that would defeat the purpose of having the this statements in the first place.
     * leaving them the same since there are no errors during runime.
     */
    this.height = height;
    this.HP = HP;
    this.ATK = ATK;
    this.AGL = AGL;
    this.DEF = DEF;
    this.GENDER = GENDER;


  }

  public String toString() {
    return "Height: " + height + ", Health: " + HP + ", Attack power: " + ATK + ", Agility: " + AGL
        + ", Defense: " + DEF + ", Gender: " + GENDER;
  }
}



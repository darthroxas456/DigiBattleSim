// OWEN ROSE
// enemy data
public class enemydata {

  public double height;

  public int HP;

  public int ATK;

  public int AGL;

  public int DEF;

  public boolean gender;
  {
    if (gender == true) {
      System.out.println("Male");
    } else {
      System.out.println("Female");
    }
  }
  // OVERLOADED CONSTRUCTOR / CONSTRUCTOR
  public enemydata(double height, int HP, int ATK, int AGL, int DEF, boolean GENDER){
    this.height = height;
    this.HP = HP;
    this.ATK = ATK;
    this.AGL = AGL;
    this.DEF = DEF;
    this.gender = gender;
   
  }
}

//overidden OVERLOADED CONSTRUCTOR / CONSTRUCTOR



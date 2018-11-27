// OWEN ROSE
// partner data
public class friendlydata {
  public double height;
  // the variable below is the int variable.
  // It's used to hold none decimal numbers to be called for later use.
  public int HP;

  public int EXP;

  public int ATK;

  public int AGL;

  public int DEF;

  // the code below holds two major code words:
  // the first is a Boolean variable which is used to see whether
  // a variable is true or false based on thing you have set for the code.
  // The second is the final code word,
  // which is used to make either public or private codes unchangeable once the code is in use.
  public String GENDER;
 

  // OVERLOADED CONSTRUCTOR / CONSTRUCTOR
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


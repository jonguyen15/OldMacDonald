class Pig implements Animal
{     
  private String myType;
  private String mySound;
  public Pig(String Type,String Sound)
  {
    myType = Type;
    mySound = Sound;
  }
  public Pig()
  {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound()
  {
    return mySound;
  }
  public String getType()
  {
    return myType;
  }
  
}

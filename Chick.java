class Chick implements Animal
{     
   private String myType;
   private String mySound;
   private String mySound2;
   public Chick(String Type,String Sound,String Sound2)
   {
      myType = Type;
      mySound = Sound;
      mySound2 = Sound2;
   }
    public Chick()
    {
      myType = "unknown";
      mySound = "unknown";
      mySound2 = "unknown";
    }
    public String getSound()
    {
      int x = (int)(Math.random()*2);
      if(x==1)
      {
      return mySound;
      }
      return mySound2;
    }
    public String getType()
    {
      return myType;
    }
    
}

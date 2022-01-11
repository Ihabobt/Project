import java.util.Random;
 

public class Warrior extends Character
{
     //private instance variables
     Warrior(String name)
     {
          super(name, (byte) 16, (byte) 6, (byte) 8, (byte) 2, (byte) 60);
     }
 
     
     public void special ()
     {
          short shrHealAmount;
          Random dice = new Random ();
          //generate a number from 1-8
          //add 2 
          shrHealAmount = (short)(3 + dice.nextInt(8));
          //use the changeHealth method to heal by the amount generated
          changeHealth(shrHealAmount);
     }
}


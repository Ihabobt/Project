public class Enemy extends Character
{
  //Constructor
  Enemy(byte round, String name)
    {
      //calling super constructor and scaling enemy 
      super(name, (byte)(10+(3*round), (byte)(10+(3*round)), (byte)(10+(3*round)), (byte)(10+(3*round)));
      
      
   }
}

public class Enemy extends Character
{
  //Constructor
  Enemy(byte round, String name)
    {
      //calling super constructor and scaling enemy 
      super(name, 10+(3*round), 10+(3*round), 10+(3*round), 10+(3*round));
      
      
   }
}

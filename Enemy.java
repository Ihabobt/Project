public class Enemy extends Character
{
  //declaring variable for the name
  Private String strName;
    //Constructor
    Enemy(byte round, String name)
    {
      this.strName = name;
      
      //calling super constructor and scaling enemy 
      super(10*3*round);
      
      
   }
}

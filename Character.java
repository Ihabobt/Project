import java.util.Random;
public class Character
{
   short shrCurrentHealth = 0;
   short shrMaxHealth = 0;
  private byte bytArmor = 0;
  private byte bytAccuracy = 0;
  private byte bytRandomDamage;
  private byte bytDamageBonus = 2;
  private byte bytDamageDie = 0;
  private String strName;
  
  
  
    

    Character (String name, byte armor, byte accuracy, byte RandomDamage, byte DamageBonus)
    {
     armor = this.bytArmor;
     accuracy = this.bytAccuracy;
     RandomDamage = this.bytRandomDamage;
     DamageBonus = this.bytDamageBonus;
     name = this.strName;
    }
    Character (){
    byte armor = 0;
    byte accuracy = 0;
    byte RandomDamge = 0;
    byte DamageBonus = 0 ;
    }
   public void changeHealth (short change) {
    shrCurrentHealth = shrCurrentHealth + change;
    
    if (shrCurrnetHealth > shrMaxHealth) 
    {
        shrCurrentHealth = shrMaxHealth;
    }else if ( shrCurrentHealth < 0 )
    { 
        shrCurrentHealth = 0; 
    
    }

 }
 
 public byte attack(byte targetArmor) {
     Random dice = new Random ();
bytRandomDamage = (byte)((1 + dice.nextByte(bytDamageDie)) + bytDamageBonus);
    if (targetArmor> (bytAccuracy + (byte)(dice.nextByte(20) + 1) )) { 
    
        return 0;
    } else   {
    
    } return bytRandomDamage;
    }
        
    
    public byte getArmor()  //getters methods
    {
        return bytArmor;
    }
    
    public String getname()  //getters methods
    {
        return strName;
    }
 
 }
 
 
 
 

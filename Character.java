import java.util.Random;
public class Character
{
  private short shrCurrentHealth = 0;
  private short shrMaxHealth = 0;
  private byte bytArmor = 0;
  private byte bytAccuracy = 0;
  private byte bytRandomDamage;
  private byte bytDamageBonus = 2;
  private byte bytDamageDie = 0;
  Random dice = new Random ();
bytRandomDamage = ((1 + dice.nextInt (bytDamageDie)) + bytDamageBonus);

    Character (byte armor, byte accuracy, byte DamageDie, byte DamageBonus);
    byte armor = this.bytArmor;
    byte accuracy = this.bytAccuracy;
    byte RandomDamage = this.bytRandomDamage;
    byte DamageBonus = this.bytDamageBonus;
    
    Character (){
    byte armor = 0;
    byte accuracy = 0;
    byte RandomDamge = 0;
    byte DamageBonus = 0 ;
}
   public void changeHealth (short change) {
    shrCurrentHealth = shrCurrentHealth + change;
    
    if (shCurrnetHealth > shrMaxHealth) 
    {
        shrCurrentHealth = shrMaxHealth;
    }else if ( shrCurrentHealth < 0 )
    { 
        shrCurrentHealth = 0; 
    
    }

 }
 
 public byte attack(byte targetArmor) {
    
    if (targetArmor> (bytAccuracy + (dice.nextInt(20) + 1) )) { 
    
        return 0;
    } else   {
    
    } return bytRandomDamage;
    }
        
    
    public byte getArmor()  //getters methods
    {
        return armor;
    }
 
 }
 

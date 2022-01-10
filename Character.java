import java.util.Random;
public class Character
{
  public class Character private short shrCurrentHealth = 0;
  private short shrMaxHealth = 0;
  private byte bytArmor = 0;
  private byte bytAccuracy = 0;
  private byte bytRandomDamage;
  private byte bytDamageBonus = 2;

  Random dice = new Random ();
    bytRandDamage = 1 + dice.nextInt (8);

    Character (byte armor, byte accuracy, byte RandomDamage, byte DamgeBonus)
    byte armor = this.shrCurrentHealth
    byte accuracy = this.bytAccuracy
    byte RandomDamge = this.bytRandomDamge
    byte DamageBonus = this.bytDamageBonus
    
    Character ()byte armor = 0
    byte accuracy = 0
    byte RandomDamge = 0
    byte DamageBonus = 0 
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
    
    if (targetArmor> (bytAccuracy + (dice.nextInt(20) + 1) ) 
    targetArmor =
     
 }

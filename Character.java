
   
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
    private String strName;





    Character (String name, byte armor, byte accuracy, byte DamageDie, byte DamageBonus, short health)
    {
        this.bytArmor = armor;
        this.bytAccuracy = accuracy;
        this.bytDamageDie = DamageDie;
        this.bytDamageBonus = DamageBonus;
        this.strName = name;
        this.shrCurrentHealth = health;
    }
        shrCurrentHealth = shrMaxHealth;
    Character ()
    {
        bytArmor = 0;
        bytAccuracy = 0;
        bytDamageDie = 0;
        bytDamageBonus = 0;
    }
    public void changeHealth (short change)
    {
        shrCurrentHealth = (short) (shrCurrentHealth + change);

        if (shrCurrentHealth > shrMaxHealth)
        {
        shrCurrentHealth = shrMaxHealth;
        }

    }

  public byte attack (byte targetArmor)
  {
    Random dice = new Random ();
    
    if (targetArmor > (bytAccuracy + (byte) (dice.nextInt (20) + 1)))
    {
	    return 0;
    }
    bytRandomDamage = (byte) ((1 + dice.nextInt (bytDamageDie)) + bytDamageBonus);
    return bytRandomDamage;
  }


  public byte getArmor ()	//getters methods
  {
    return bytArmor;
  }

  public String getName ()	//getters methods
  {
    return strName;
  }
  
  public short getHealth()
  {
      return shrCurrentHealth;
  }

}

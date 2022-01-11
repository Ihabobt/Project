public class Enemy extends Character {
  // Constructor
  Enemy(byte round, String name) {
    // calling super constructor and scaling enemy
    super(name, 
    (byte) (10 + (3 * round)), //armor
    (byte) (10 + (3 * round)), //accuracy
    (byte) (10 + (3 * round)), //damage die
    (byte) (10 + (3 * round)), //damage bonus
    (short) (50 + (5 * round))); //health
  }
}
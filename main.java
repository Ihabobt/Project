//import java.util Classes
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class main {
  public static void main (String[] args) {
    //clean the screen every time code runs
        System.out.println("\u000C");
        
        //declare variables which will be used later on
        String strCharacter = "";
        String strUserName;
        Character player;
        int intWaveCount = 1;
        
        //declare and initialize the option variable to choose for menu
        int intOption = 0;
        
        //starts the game with the user prompt
        //also gets user's name
        strUserName = startGame();
        
        while(true)
        {
            //gives the user a menu of options to choose from
            System.out.println("1. Play \n2. Exit\n3. Help");
            
            //verify the user input
            intOption = optionCheck(intOption);
            
            if(intOption == 1)
            {
                //ask the user what class they want to play
                System.out.println("Which character would you like to choose?");
                System.out.println("(Warrior) or (Mage)");
                System.out.println("Warrior class allows you to have 16 armor and 60 health.");
                System.out.println("Mage allows you to have 14 armor and 45 health.");
                System.out.println();
                
                //verify user input
                strCharacter = characterOption();

                //create the actual player character
                if (strCharacter.equalsIgnoreCase("warrior"))
                {
                    player = new Warrior(strUserName);

                    //After each wave check to see user health
                    if (player.getshrCurrentHealth <= 0)
                    {
                        endGame();
                    }
                }
                else if (strCharacter.equalsIgnoreCase("mage"))
                {
                    player = new Mage(strUserName);
                }

                //loop the game with a method
                while(wave(player, intWaveCount));

            }
            else if(intOption == 2)
            {
                System.out.println("Thanks for playing the game! Hope to see you next time!");
                break;
            }
            else if(intOption == 3)
            {
                //calls the info method
                info();
            }
        }
    }

    //Method that runs each wave
    public static boolean wave(Character player, int intWaveCount)
    {
        //arraylist for all the enemies in the wave
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        
        
        //generate enemies depending on the wave count
        for (byte i = 0; i < (Math.floor(intWaveCount/5)+2); i++)
        {
            enemies.add(new Enemy((byte)intWaveCount, "Enemy " + (i+1)));
        }

        //loop through each combat round
        //use a method that returns a 0 to continue, a 1 if the player dies, and a 2 if all the enemies die
        while()
    }


    //Method to output the information about the game 
    public static void info()
    {
        System.out.println("How the game works: As your character, you will enter the 1st round where you will encounter a group of monsters.");
        System.out.println("You will have the option to choose which attacks to use");
        System.out.println("Your attacks will do damage, same with the monster's");
        System.out.println("Once you have 0 health, you lose. Once the monster's have 0 health, they die.");
        System.out.println("If all the monster's die, you move on to the next wave. Each wave will get harder. Try to survive as many waves as possible!");
    }
    
    //Method to check for users input when prompted the menu choice
    public static int optionCheck(int menuCheck)
    {
        boolean bolTryCatch = false; 
        
        do
        {
            try
            {
                menuCheck = new Scanner(System.in).nextInt();
                
                //checks to see if user input is correct
                if(menuCheck != 1 && menuCheck != 2 && menuCheck != 3)
                {
                    System.out.println("Please enter either '1 (Play)', '2(Exit)', or '3(Help)'");
                    bolTryCatch = true;
                }
                else
                {
                    bolTryCatch = false;
                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter either '1 (Play)', '2(Exit)', or '3(Help)'");
                bolTryCatch = true;
            }
        }
        while(bolTryCatch);
        
        //returns the variable back to the main program
        return menuCheck;
    }
    
    //Method to check which character user inputs
    public static String characterOption()
    {
        boolean bolTryCatch = false;
        String check;
        
        do
        {
            check = new Scanner(System.in).nextLine();
            
            //Checks to see if user inputted the correct characters they can choose from
            if (!check.equalsIgnoreCase("warrior") && !check.equalsIgnoreCase("mage"))
            {
                System.out.println("Please enter either 'warrior' or 'mage'");
                bolTryCatch = true;
            }
            else
            {
                bolTryCatch = false;
            }
        } while(bolTryCatch); 
        
        return check;
    }
    
    //Method that ends the game
    public static void endGame(int intWaveCounter)
    {
        System.out.println("YOU LOST!!!");
        System.out.println("You lasted: " + intWaveCounter + "amount of waves");
    }

    //Method that starts the game
    public static String startGame()
    {
        String strUserName;
        
        System.out.println("WELCOME TO SLAYING THE BEAST ADVENTURES!");
        
        System.out.println("Please choose your name");
        
        strUserName = new Scanner(System.in).nextLine();
        return strUserName;
        
    }
}

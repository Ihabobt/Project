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
        
        //declare and initialize the option variable to choose for menu
        int intOption = 0;
        
        //starts the game with the user prompt
        startGame();
        
        while(true)
        {
            //gives the user a menu of options to choose from
            System.out.println("1. Play \n2. Exit\n3. Help");
            
            //verify the user input
            intOption = optionCheck(intOption);
            
            if(intOption == 1)
            {
                System.out.println("Which character would you like to choose?");
                System.out.println("(Warrior) or (Mage)");
                System.out.println("Warrior class allows you to have 16 armor and 60 health.");
                System.out.println("Mage allows you to have 14 armor and 45 health.");
                System.out.println();
                
                //verify user input
                characterOption(strCharacter);
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

    //Method to output the information about the game 
    public static void info()
    {
        System.out.println("How the game works: As your character, you will enter the 1st round where you will encounter unique monsters.");
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
    public static String characterOption(String check)
    {
        boolean bolTryCatch = false;
        
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
    public static void startGame()
    {
        String struserName;
        
        System.out.println("WELCOME TO SLAYING THE BEAST ADVENTURES!");
        
        System.out.println("Please choose your name");
        
        struserName = new Scanner(System.in).nextLine();
        
    }
}

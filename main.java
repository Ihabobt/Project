public class main {
  public static void main (String[] args) {
    //clean the screen every time code runs
        System.out.println("\u000C");
        
        String strCharacter = "";
        String struserName;
        
        int intOption = 0;
        
        //starts the game with the user prompt
        
        System.out.println("WELCOME TO SLAYING THE BEAST ADVENTURES!");
        System.out.println("Please choose your name");
        struserName = new Scanner(System.in).nextLine();
        
        
        
        //gives the user a menu of options to choose from
        System.out.println("1. Play\n 2. Exit\n 3.Help");
        
        intOption = optionCheck(intOption);
        
        if(intOption == 1)
        {
            System.out.println("Which character would you like to choose?");
            System.out.println("(Warrior) or (Mage)");
            
            //WORK ON THIS FIRST
            characterOption(strCharacter);
        }
        else if(intOption == 2)
        {
            System.out.println("Thanks for playing the game! Hope to see you next time!");
        }
        else if(intOption == 3)
        {
            info();
        }
     }
  }
    
    
    
    
    
    

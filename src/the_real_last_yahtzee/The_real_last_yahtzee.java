/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_real_last_yahtzee;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 9279522
 */
public class The_real_last_yahtzee 
{
    public static void displayScoreBoard(int[] scoreBoard, String playerName)
            
    {  // Display empty scoreboard wth player's name 
            System.out.println("");
            System.out.println("| \t\t\t|\t\t" + playerName + "|");
            System.out.println("| 1  | Ones\t        |\t"+ scoreBoard[0]+ "\t|");
            System.out.println("| 2  | Twos\t        |\t"+ scoreBoard[1]+ "\t|");
            System.out.println("| 3  | Threes\t        |\t" + scoreBoard[2]+ "\t|");
            System.out.println("| 4  | Fours\t        |\t" + scoreBoard[3]+ "\t|");
            System.out.println("| 5  | Fives\t        |\t"+ scoreBoard[4]+ "\t|");
            System.out.println("| 6  | Sixes\t        |\t" + scoreBoard[5]+ "\t|");
            System.out.println("| 7  | 3 Of A Kind\t|\t" + scoreBoard[6]+ "\t|");
            System.out.println("| 8  | 4 Of A Kind\t|\t" + scoreBoard[7]+ "\t|");
            System.out.println("| 9  | Full House\t|\t" + scoreBoard[8]+ "\t|");
            System.out.println("| 10 | Sml Straight\t|\t" + scoreBoard[9]+ "\t|");
            System.out.println("| 11 | Lrg Straight\t|\t" + scoreBoard[10]+ "\t|");  //
            System.out.println("| 12 | YAHTZEE\t        |\t" + scoreBoard[11]+ "\t|");
            System.out.println("| 13 | Chance\t        |  \t" + scoreBoard[12]+ "\t|");
            System.out.println("");

    
    
    }
        public static void finalScoreboard(int[] scoreBoard,int totalUpperScore ,String playerName)
        { System.out.println("");
            System.out.println("| \t\t\t|\t\t" + playerName + "|");
            System.out.println("| 1  | Ones\t        |\t"+ scoreBoard[0]+ "\t|");
            System.out.println("| 2  | Twos\t        |\t"+ scoreBoard[1]+ "\t|");
            System.out.println("| 3  | Threes\t        |\t" + scoreBoard[2]+ "\t|");
            System.out.println("| 4  | Fours\t        |\t" + scoreBoard[3]+ "\t|");
            System.out.println("| 5  | Fives\t        |\t"+ scoreBoard[4]+ "\t|");
            System.out.println("| 6  | Sixes\t        |\t" + scoreBoard[5]+ "\t|");
            System.out.println("| 7  | 3 Of A Kind\t|\t" + scoreBoard[6]+ "\t|");
            System.out.println("| 8  | 4 Of A Kind\t|\t" + scoreBoard[7]+ "\t|");
            System.out.println("| 9  | Full House\t|\t" + scoreBoard[8]+ "\t|");
            System.out.println("| 10 | Sml Straight\t|\t" + scoreBoard[9]+ "\t|");
            System.out.println("| 11 | Lrg Straight\t|\t" + scoreBoard[10]+ "\t|");  //
            System.out.println("| 12 | YAHTZEE\t        |\t" + scoreBoard[11]+ "\t|");
            System.out.println("| 13 | Chance\t        |  \t" + scoreBoard[12]+ "\t|");
            System.out.println("");
            System.out.println("| \t\t|\t\t|");
            System.out.println("|     TOTAL\t|\t" + totalUpperScore + "\t|");
            System.out.println("\nThank you for playing!\n");
        
        
        
        
        
        
        
        
        
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // CODE GOES HERE
        final int NUM_OF_DICE = 5;
        final int SIDES_OF_DICE = 6;
        final int NUM_OF_ROUNDS = 13;
        int numOfPlayers =5;
        int col=0;
        int row=0;
        
        int[] diceRoll = new int[NUM_OF_DICE];      // array to score dice roll
        int[] scoreBoard = new int[NUM_OF_ROUNDS];  // array for scoreboard
        char rollAgain = 'N';                       // user wants to roll again
        int reRollAvailable = 3;                    // how many rerolls available
        int diceToReRoll = 0;                       // how nany dice to rereoll
        int totalUpperScore = 0;                    // total score (upper section)
        
        
        String playerName = "";                     // player's name
        
        Random rnd = new Random();
        Scanner kb = new Scanner(System.in);
        
        // TODO: You must display instructions for the user
        // Display game title and instructions
        System.out.println("===========");
        System.out.println("  YAHTZEE ");
        System.out.println("===========");
        System.out.println("The objective of the game is to score points by rolling 5 dice simultaniously\n"
                + "to make the required combinations.The user is limited to 3 rolls per turn during the\n"
                + "game's 13 rounds.In each round the player chooses which box to allocate the score for the\n"
                + "round.He can keep all 5 values of the dice or roll the ones that were not kept. The player\n"
                + "who scores the most points wins.");
        System.out.println("=====================================================================================");
        
        

        //number of players
          //array number of players
        System.out.println("Enter number of players (1 to 5)");
        numOfPlayers = kb.nextInt();
        String[] players = new String[numOfPlayers];
          //for loop to determine player quantity
        for (int i = 0; i < players.length; i++) 
            // limiting player quantity to 5 with break
        
          {     
           if (numOfPlayers>5)
            {
                System.out.println("You Entered an Invalid amount (1 to 5)");
                break;      //breaks game if more than 5 players
               
            }
            else
                 System.out.print("Enter Player " + (i + 1) + " name:");
                 System.out.println("");
                   players[i] = kb.next();
          
                 
          
           
               
      
      
      

          }     
               // alphabetical sorting of players
              Arrays.sort(players);

          System.out.println("Displaying Players in alphabetical order ...");
          System.out.println("");
          System.out.println("");
          for (int i = 0; i < players.length; i++)
          {
           System.out.println("Player " + (i +1) + " name:");
           System.out.println(players[i]);
          }
             //  for loop rotating players
       
        

           

        


       


            // Display empty scoreboard wth player's name 
            displayScoreBoard(scoreBoard, playerName);

      
      
       
        
        
        // Six rounds 
        
        // This loop handles the number of rounds required
        for (int count=1; count <=NUM_OF_ROUNDS; count++ )
        {                                                               //
            // Display round number
            System.out.println ("\n\nROUND " + count + "\n");
         
            // Roll five dice and store values in array
            for (int dice=0; dice< NUM_OF_DICE; dice++)
            {
                diceRoll[dice] = rnd.nextInt(SIDES_OF_DICE-1) + 1;
            }
            
           // Display the roll of the dice
            System.out.println("YOU ROLLLED:");
            for (int dice=0; dice < NUM_OF_DICE; dice++)
            {
                System.out.println("\t\tDice no. #" + (dice+1) + ": " + diceRoll[dice]);
            }
                
            // Handle two rerolls of the dice selected (if required)
            reRollAvailable = 2;
            do  
            {
                // Tell user how many rerolls are available to them
                System.out.println("\nYou have " + reRollAvailable + " re-roll(s) left.");
                // Ask user if they want to reroll any dice
                System.out.print("Do you want to reroll any dice? (Y/N)? ");
                rollAgain = kb.next().charAt(0);
                if (rollAgain == 'Y' || rollAgain == 'y')
                {
                    // Ask user which dice to reroll
                    System.out.print("How many dice do you want to reroll? ");
                    diceToReRoll = kb.nextInt();
                 
                   
                        
                    
                    
                    
                    // Loop through the number dice to be rerolled
                    for (int dice=1; dice<=diceToReRoll; dice++)
                    {
                        // Ask user for dice number to reroll, reroll and store it
                        System.out.print("Enter dice number to reroll (e.g. 1): ");
                        int diceNumb = kb.nextInt();
                        // Reroll dice number as requested
                        diceRoll[diceNumb-1] = rnd.nextInt(SIDES_OF_DICE-1) + 1;   
                    }

                    // Display the roll of the dice
                    System.out.println("YOUR DICE ARE NOW:");
                    for (int dice=0; dice < NUM_OF_DICE; dice++)
                    {
                        System.out.println("\t\tDice no. #" + (dice+1) + ": " + diceRoll[dice]);
                    } 
                    // Decrement number of rolls avaible
                    reRollAvailable --;
                    // Remove crlf from input buffer  
                    kb.nextLine();
               
                }
                 //stop and store points if reroll is N
               
                 
           
                
                
                
                
                
              
            } while ((reRollAvailable > 0)&&(rollAgain=='y' || rollAgain=='Y'));
                                                                                  // PUTTING } HERE = 1 PLAYER 6 ROUNDS
            // Display scoreboard
            // TO DO: If no score allocated to box, do not display 0
            
            
             displayScoreBoard(scoreBoard, playerName);
         
            // Ask user which box they want to allocate their score.
            System.out.print("Which box would you like to allocate your score? (e.g. 1 for Ones) "); 
            int boxToScore = kb.nextInt();
            kb.nextLine();
          
            // Calculate score by counting number of dice matching the box
            int numFound = 0;
            for (int dice=0; dice<NUM_OF_DICE; dice++)
            {
                if (diceRoll[dice] == boxToScore)
                {
                numFound++;
                }
            }
            int score = numFound * boxToScore;
            // Allocate score to box on scoreboard chosen
            // TO DO: Check that this box hasn't been used yet
            scoreBoard[boxToScore-1] = score;
            
            // Calculate total score (upper section)
            totalUpperScore = scoreBoard[0] + scoreBoard[1] + scoreBoard[2] +
                    scoreBoard[3] + scoreBoard[4] + scoreBoard[5];
            
            // Display scoreboard
            // TO DO: If no score allocated to box, do not display 0
            //displayBoard METHOD
            displayScoreBoard(scoreBoard, playerName);
        
        } 
            // At the end of the game display the final scoreboard
            System.out.println("\n\nFINAL SCOREBOARD\n");
            System.out.println("| \t\t|\t" + playerName + "\t|");
            System.out.println("| 1 | Ones\t|\t" + scoreBoard[0]+ "\t|");
            System.out.println("| 2 | Twos\t|\t" + scoreBoard[1]+ "\t|");
            System.out.println("| 3 | Threes\t|\t" + scoreBoard[2]+ "\t|");
            System.out.println("| 4 | Fours\t|\t" + scoreBoard[3]+ "\t|");
            System.out.println("| 5 | Fives\t|\t" + scoreBoard[4]+ "\t|");
            System.out.println("| 6 | Sixes\t|\t" + scoreBoard[5]+ "\t|");
            System.out.println("| \t\t|\t\t|");
            System.out.println("|     TOTAL\t|\t" + totalUpperScore + "\t|");
            System.out.println("\nThank you for playing!\n");
                   
    }
    
}

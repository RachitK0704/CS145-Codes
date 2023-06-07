//Programmer:Rachit Khandelwal
//Class: CS141

//Assignment: Lab 4: Guessing Game
//Purpose: The program runs a guessing game for the user to play

import java.util.Scanner;
import java.util.Random;

public class RKGuessingGame
{
   public static void main (String[] args)
   {
      //defining variables and displaying methods
      introduction();  
      int guesses = playGame();
      int totalGuesses = guesses;    
      
      //asking if user wants to play again
      System.out.print("Do you want to play again? ");
      char answer = userAnswer();
      int totalGames = 1;
      int bestGame = guesses;
      //user input decision to play the game with yes option
      while (answer == 'y' || answer == 'Y')
      {
         totalGames++;
         int newGuesses = playGame();
         totalGuesses = totalGuesses + newGuesses;
         if (newGuesses < bestGame)
         {
            bestGame = newGuesses;
         }
         System.out.print("Do you want to play again? ");
         answer = userAnswer();
      }
      //user input decision to not play the game
      if (answer == 'n' || answer == 'N')
      {
         printResults(totalGames, totalGuesses, bestGame);
      }
      else 
      {
         System.out.println("Invalid input. Run the program again.");
      }
   }
   //method to print out the instructions of the game
   public static void introduction()
   {
      final int maxLimit = 101;
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1-100");
      System.out.println("and will allow you to guess until you get it.");
      System.out.println("For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");
   }
   //method for user input number
      public static char userAnswer()
   {
      Scanner userDecision = new Scanner(System.in);
      String decision = userDecision.next();
      char answer = decision.charAt(0);
      return answer;
   }
   //method for the game system
   public static int playGame()
   {
      //for range 1-100
      Random rand = new Random();
      final int maxLimit = 101;
      int computerNumber = rand.nextInt(maxLimit) + 1;
      System.out.println();
      System.out.println("I'm thinking of a number between 1 and " + (maxLimit-1));
      System.out.print("Your guess? ");
      
      //user inputs their guess of the number
      Scanner sc = new Scanner(System.in);
      int guess = sc.nextInt();
      int totalGuesses = 1;
      while (guess != computerNumber)
      {
         //rules to determine whether the guess number is higher, lower, invalid 
         totalGuesses++;
         if (guess < 1 || guess > (maxLimit-1)) 
         {
            System.out.println("Invalid input.");
         }
         else if (guess < computerNumber)
         {
            System.out.println("It's higher.");
         }
         else if (guess > computerNumber)
         {
            System.out.println("It's lower.");
         }
         System.out.print("Your guess? ");
         guess = sc.nextInt();
      }
      //if user matches the number given by the computer, it prints out the total guesses
      if (guess == computerNumber)
         {
            if (totalGuesses == 1)
            {
            System.out.println("You got it right in " + totalGuesses + " guess");
            }
            else
            {
            System.out.println("You got it right in " + totalGuesses + " guesses.");
            }
         }
      return totalGuesses;
   } 
   //method for printing overall results
   public static void printResults(double games, double guesses, int bestGame)
      {
         double avgGuess = guesses / games;
         System.out.println("\nOverall results:");
         System.out.println("____________________");
         System.out.printf("\nTotal games    = %.0f", games);
         System.out.printf("\nTotal guesses  = %.0f", guesses);
         System.out.printf("\nGuesses per game   = %.1f", avgGuess);
         System.out.println("\nbest game      = " + bestGame);
      }
}      
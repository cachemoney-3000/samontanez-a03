/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

/*
 *  Guess the Number is a game with 3 levels of difficulty.
 *  Level 1 - Guess a number between 1 and 10
 *  Level 2 - Guess a number between 1 and 100
 *  Level 3 - Guess a number between 1 and 1000
 *  The program picks a random number in the range and prompts the player to guess
 *  Gives user hints if the number is too high or too low
 *  Once the player guesses correctly, the program presents the number of guesses
 *  and asks the player if they want to play again.
 */

public class Solution32 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char playAgain;
        //header or title
        System.out.println("Let's play Guess the Number!");

        //the program will loop if user keep entering "y" after the program supposed to end
        do {
            //prompts the user for the difficulty level and store the level to 'level'
            int level = Integer.parseInt(difficultyLevel());

            //deals with generating a random number based on difficulty level
            playAgain(level);

            //prompts user if they want to play another game
            //if they click 'y' or 'Y', the program will keep running
            System.out.print("\nDo you wish to play again (Y/N)? ");
            playAgain = scanner.next().charAt(0);

            System.out.println(" ");
            scanner.nextLine();
        } while (playAgain == 'y' || playAgain == 'Y');

    }

    //takes care of the difficulty level of the game
    //only accepts valid inputs, inputs must be between 1-3 only
    private static String difficultyLevel(){
        String level;
        //keep asking until a valid input was entered
        do {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            level = scanner.nextLine();

        } while (!level.matches("[1-3]"));

        return level;
    }

    //method that will generate a random number based on the difficulty level
    public static int key(int level){
        double range = Math.pow(10, level);
        //random number will range from 1 - 10^n, n = difficulty level
        int key = (int)(range * Math.random());
        return key;
    }

    //method that will print out an output
    private static void playAgain(int level){
        int key = key(level);
        String keyStr = String.valueOf(key);

        System.out.print("I have my number. What's your guess? ");
        String guessStr = scanner.nextLine();
        int guess = Integer.parseInt(guessStr);
        int guessCounter = 1;

        //if the guess doesn't match with the key, the program will keep asking
        if(!guessStr.matches(keyStr)){
            do{
                //if the guess is higher than the key it will print "too high"
                if(key < guess){
                    System.out.print("Too high. Guess again: ");
                }
                //if the guess is lower than the key it will print "too low"
                if(key > guess) {
                    System.out.print("Too low. Guess again: ");
                }
                guessStr = scanner.nextLine();
                //counts how many guesses have been made
                guessCounter++;
                guess = Integer.parseInt(guessStr);

            }while(!guessStr.matches(keyStr));
        }
        //if the guess and key matched, it will print out how many guesses they made before getting it
        if(guessStr.matches(keyStr)) {
            System.out.println("You got it in " + guessCounter + " guesses!");
        }
    }
}

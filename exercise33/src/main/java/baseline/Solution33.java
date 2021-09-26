/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Random;
import java.util.Scanner;

/*
* Create a Magic 8 Ball game that
* Prompts for a question
* Then displays either "Yes," "No," "Maybe," or "Ask again later.
*/

public class Solution33 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution33 sol33 = new Solution33();
        //prompts user asking them to ask a question
        System.out.println("What's your question? ");
        scanner.nextLine();
        //program will call the answer method to print out a random response
        System.out.println(sol33.answer());
    }

    //method that will takes care of random answer ex:(yes, no, maybe, ask again)
    public String answer(){
        //store the possible answer to an array
        String[] response = {"Yaaaaaass", "Hell nah!", "Sheesh! Who knows", "Ask again later", "Gods plan", "Yeeet"};
        //random number generator
        Random rand = new Random();
        //the responseIndex creates a random numbers based on how many Strings are stored in 'response'
        int responseIndex = rand.nextInt(response.length);
        //prints out a random response
        return (response[responseIndex]);
    }

}

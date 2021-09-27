/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* Create a program that picks a winner for a contest or prize drawing.
* Prompt for names of contestants until the user leaves the entry blank.
* Then randomly select a winner.
 */

public class Solution35 {
    private ArrayList<String> contestant;
    private static final Scanner scanner = new Scanner(System.in);

    //constructor that stores the name of contestants
    public Solution35(){
        contestant = new ArrayList<>(20);
    }

    public static void main(String[] args) {
        Solution35 sol35 = new Solution35();
        String nameStr;

        //keeps looping until an empty string is entered
        do{
            //prompts user to enter a name
            System.out.print("Enter a name: ");
            nameStr = scanner.nextLine();
            //method that adds a name to a constructor
            sol35.addContestant(nameStr);
        } while(!nameStr.isEmpty());

        //prints out who is the winner
        System.out.println("The winner is " + sol35.winner());

    }

    //adds the name to a constructor
    public void addContestant(String name){
        //don't add the empty string
        if(! name.equals("")){
            contestant.add(name);
        }
    }

    //method that will choose a random winner
    public String winner(){
        Random random = new Random();
        //randomize a winner
        String winner = contestant.get(random.nextInt(contestant.size()));
        //print the final output
        return winner;
    }
}

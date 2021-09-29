/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.ArrayList;
import java.util.*;

/*
* Create a program that prompts for a list of numbers, separated by spaces.
* Have the program print out a new list containing only the even numbers.
 */

public class Solution38 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution38 sol38 = new Solution38();

        //prompts user asking to enter a number separated by spaces
        String numbers = sol38.readValueFromUser("Enter a list of numbers, separated by spaces: ");
        String numberList[] = numbers.split(" ");
    }

    //Handles all the input from the user.
    private String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    //method that will store each numbers into an array
    private void addNumbers(){

    }

    //method responsible for filtering the even numbers
    public static ArrayList<Integer> filterEvenNumbers(){
        //loop through the list to find the even numbers
        for(int i = 0){
            //if the number is even store it into different list
        }
    }

    //method responsible for printing the output
    public void output(){
        //prints out the even numbers
    }
}

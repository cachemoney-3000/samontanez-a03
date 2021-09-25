/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

public class Solution29 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution29 sol29 = new Solution29();

        //prompt user asking for the rate of return
        //store the value to 'rate'
        int rate = sol29.readRate("What is the rate of return? ");

        //'year' will call the output method to calculate the years to double investment
        int year = sol29.output(rate);
        System.out.println("It will take " + year + " years to double your initial investment");
    }


    public static boolean isValid(String r){
        //if the user enters 0, then the input is not valid
        if(r.equals("0")) {
            System.out.println("Sorry. That's not a valid input.");
            return false;
        }
        //if the user enters a letter, then the input is not valid
        else if(r.matches("[a-zA-Z]+")) {
            System.out.println("Please enter a number");
            return false;
        }
        //if the input passed the above condition, then its valid
        else
            return true;
    }

    ////Handles all the input from the user, and do not accept bad inputs
    private int readRate(String prompt) {
        String r;
        do{
            System.out.printf(prompt);
            r = scanner.nextLine();
        }
        //keep asking the user for the rate of return until the value is valid
        while(!isValid(r));

        //converts string to int
        int rateOfReturn = Integer.parseInt(r);
        return rateOfReturn;
    }

    public int output(int rate){
        //formula to determine how many years it will take to double initial investment
        int year = (72/rate);
        //returns the year
        return year;
    }
}

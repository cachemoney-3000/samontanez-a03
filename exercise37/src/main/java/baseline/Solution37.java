/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
/*
* Create a program that generates a secure password.
* Prompt the user for the minimum length,
* the number of special characters,
* and the number of numbers.
* Then generate a password for the user using those inputs.
 */

import java.util.Scanner;

public class Solution37 {
    Scanner scanner = new Scanner(System.in);
    private int passwordSize; //stores the desired password size
    private int numSpecialChar; //stores how many special characters in a password
    private int numNumbers; //stores how many numbers in a password
    private String password; //stores the generated password
    private static final char[] specialChar = {'!', '@', '#', '$', '%', '^', '&', '*', '+', '?'}; //all the special characters
    private static final char[] letters = new char[52]; //26 (lowercase) + 26 (uppercase) = 52 letters
    private static final char[] numbers = new char[10]; //number ranging 0 - 9

    //constructor to initialize the values
    public Solution37(){

    }
    public static void main(String[] args) {
        //prompt user asking the minimum length of password
        //prompt user asking how many special characters
        //prompt user how many numbers
        //print out the generated password

    }
    //method responsible for adding a numbers into the password
    private void addNumbers(){

    }

    //method responsible adding special characters to the password
    private void addSpecial(){

    }

    //method responsible adding letters to the password
    private void addLetters(){

    }

    //method responsible for the length of the password
    private void passLength(){

    }

    //method responsible for generating the password
    private void generatePass(){

    }

    //method responsible for printing the output
    private void output(){
        
    }
}

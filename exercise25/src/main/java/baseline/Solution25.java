/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution25 sol25 = new Solution25();

        //Prompt the user to create a password
        //'password' will store the input
        String password = sol25.readValueFromUser("Create a password: ");
        //calls the output method and pass the String password, this will print the final result
        sol25.output(password);
    }

    //Handles all the input from the user.
    private String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String passwordValidator(String password){
        //'x' stores the length of the string password
        int x = password.length();
        //boolean hasLetter,hasDigit, and hasSpecialChar all initialized to false
        boolean hasLetter = false,
                hasDigit = false,
                hasSpecialChar = false;

        //loops until the last character of the string 'password'
        for (char i : password.toCharArray())
        {
            //if the 'password' have letters, hasLetter set to true
            if (Character.isLetter(i))
                hasLetter = true;
            //if the 'password' have digits, hasDigit set to true
            if (Character.isDigit(i))
                hasDigit = true;
            //if the 'password' have special characters, hasSpecialChar set to true
            if (password.matches("(?=.*[~!@#$%^&*()_-]).*"))
                hasSpecialChar = true;
        }

        //If the 'password' have letters, digits, special characters and longer than 8 characters
        //then the password is "very strong
        if(hasLetter && hasDigit && hasSpecialChar && (x>=8))
            return "very strong";
        //if the 'password' only have letters, digits, and longer than 8 characters
        //then the password is "strong"
        else if(hasLetter && hasDigit && (x>=8))
            return "strong";
        //If the 'password' only have letters but less than 8 characters
        //then the password is "weak"
        else if(hasLetter && (x<8))
            return "weak";
        //if the 'password' only have numbers, then the password is weak
        else
            return "very weak";
    }

    private void output(String password){
        //calls the passwordValidator, pass the password string
        //stores the return value of passwordValidator method to 'passwordStrength'
        String passwordStrength = passwordValidator(password);
        //prints out the final results
        System.out.println("The password " + password + " is a " + passwordStrength + " password.");
    }

}

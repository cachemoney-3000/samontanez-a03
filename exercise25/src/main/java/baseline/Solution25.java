/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner scanner = new Scanner(System.in);

    /*
    Prompt user: "Create a password: "
    String 'password' will store the user input.
    'output' method will pass the string password and prints the result.
     */
    public static void main(String[] args) {
        Solution25 sol25 = new Solution25();

        String password = sol25.readValueFromUser("Create a password: ");
        sol25.output(password);
    }

    //Handles all the input from the user.
    private String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /*
    passwordValidator determines the password strength:
        'x' = stores the length of the string 'password'
        boolean: hasLetter, hasDigit, and hasSpecialChar = all initialize to false.
            for(loops until the last letter of the 'password'){
                if 'password' have letters
                    hasLetter = true;
                if 'password' have numbers
                    hasNumbers = true;
                if 'password' have special characters
                    hasSpecialChar = true;
        }

        if (password have letters, numbers, special characters and length>=8)
            password = very strong
        else if (password have letters, numbers and length>=8)
            password = strong
        else if (password have letters and length<8)
            password = weak
        else
            password = very weak
     */
    public static String passwordValidator(String password){
        int x = password.length();
        boolean hasLetter = false,
                hasDigit = false,
                hasSpecialChar = false;

        for (char i : password.toCharArray())
        {
            if (Character.isLetter(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (password.matches("(?=.*[~!@#$%^&*()_-]).*"))
                hasSpecialChar = true;
        }

        if(hasLetter && hasDigit && hasSpecialChar && (x>=8))
            return "very strong";
        else if(hasLetter && hasDigit && (x>=8))
            return "strong";
        else if(hasLetter && (x<8))
            return "weak";
        else
            return "very weak";
    }

    /*
    'passwordStrength' = calls the passwordValidator, pass the password string,
                         and store the return value from passwordValidator method
    Prints "The password <password> is a <passwordStrength> password."
     */

    private void output(String password){
        String passwordStrength = passwordValidator(password);
        System.out.println("The password " + password + " is a " + passwordStrength + " password.");
    }

}

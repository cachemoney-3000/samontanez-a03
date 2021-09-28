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

import java.util.*;

public class Solution37 {
    Scanner scanner = new Scanner(System.in);

    List<Character> specialChar; //stores the special characters
    List<Character> letters; //26 (lowercase) + 26 (uppercase) = 52 letters
    List<Character> numbers; //number ranging 0 - 9

    //constructor to initialize the values
    public Solution37(){
        specialChar = new ArrayList<>();
        listSpecial();
        letters = new ArrayList<>();
        listLetters();
        numbers = new ArrayList<>();
        listNumbers();
    }

    public static void main(String[] args) {
        Solution37 sol37 = new Solution37();//stores the desired password size
        String password; //stores the generated password

        //prompt user asking the minimum length of password
        int passwordSize = sol37.readValueFromUser("What's the minimum length? ");
        //prompt user asking how many special characters
        int numSpecialChar = sol37.readValueFromUser("How many special characters? ");
        //prompt user how many numbers
        int numNumbers = sol37.readValueFromUser("How many numbers? ");

        //stores the generated password
        String generatedPass = sol37.generatePass(passwordSize, numSpecialChar, numNumbers);
        //print out the generated password
        System.out.println("Your password is " + generatedPass);
    }

    //initialize the values inside the 'numbers' list
    private void listNumbers(){
        String numList = "0123456789";
        for(char ch: numList.toCharArray())
            numbers.add(ch);
    }
    //initialize the values inside the 'letters' list
    private void listLetters(){
        String letterList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(char ch: letterList.toCharArray())
            letters.add(ch);
    }
    //initialize the values inside the 'specialChar' list
    private void listSpecial(){
        String specialList = "!@#$%^&*()_+{}|:?><";
        for(char ch: specialList.toCharArray())
            specialChar.add(ch);
    }

    //Handles all the input from the user.
    private int readValueFromUser(String prompt) {
        System.out.print(prompt);
        //Do not accept input that is not a number
        while(!scanner.hasNextInt()){
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    //method responsible for generating the password
    public String generatePass(int passwordSize, int numSpecialChar, int numNumbers){
        Random random = new Random();
        //stores the collected characters from letters, numbers, and specialChar
        ArrayList<Character> passwordChars = new ArrayList<>();

        //loop through the number of special characters required
        for(int i=0; i < numSpecialChar; i++)
            //add a random special character to the 'passwordChars'
            passwordChars.add(specialChar.get(random.nextInt(specialChar.size())));

        //loop through the number of numbers required
        for(int j=0; j < numNumbers; j++)
            //add a random number to the 'passwordChars'
            passwordChars.add(numbers.get(random.nextInt(numbers.size())));

        //start from the remaining size of the 'passwordChars' up to the required password size
        for(int k = passwordChars.size()-1; k < passwordSize; k++)
            //add a letter to the remaining spot
            passwordChars.add(letters.get(random.nextInt(letters.size())));

        //shuffle the password
        Collections.shuffle(passwordChars);

        //initialize the password string
        String password = "";
        //loop through the completed passwordChars
        for(Character p : passwordChars){
            //add all the characters on passwordChars to the 'password' string
            password += Character.toString(p);
        }
        //return the completed randomly generated password
        return password;
    }
}

/*
Code changes:
* removed all unnecessary methods
* changed the skeleton on the program for easier testing
 */
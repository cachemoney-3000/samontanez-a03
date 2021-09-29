/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

/*
* Create a program that compares two strings
* Determines if the two strings are anagrams.
* The program should prompt for both input strings
* Display the output
 */

import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String firstString;
        String secondString;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        //prompt the user to enter the first string, store the input to 'firstString'
        firstString =  readValueFromUser("Enter the first string: ");
        //prompt the user to enter the second string, store the input to 'secondString'
        secondString = readValueFromUser("Enter the second string: ");

        //calls the method output and pass the first and second string and prints the final output
        output(firstString, secondString);
    }

    //Handles all the input from the user.
    private static String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isAnagram(String first, String second){

        //if the length of the first and second string do not match, return false
        if(first.length() != second.length()){
            return false;
        }
        // otherwise, if they are the same length
        else{
            // compare the letters of the first and second characters
            char[] firstChar = first.toLowerCase().toCharArray();
            char[] secondChar = second.toLowerCase().toCharArray();
            Arrays.sort(firstChar);
            Arrays.sort(secondChar);

            // if all the letters match, return true
            // if the letters don't match, return false
            return Arrays.equals(firstChar, secondChar);
        }
    }

    private static void output(String s1, String s2){
        //calls the isAnagram method
        //if the return value of isAnagram is true, it will print that the strings are anagram
        if(isAnagram(s1, s2) == true){
            System.out.println("\""+s1+"\"" + " and " + "\""+s2+"\"" + " are anagrams.");
        }

        //if the return value of isAnagram is true, it wil print that the strings are not anagram
        else
            System.out.println("\""+s1+"\"" + " and " + "\""+s2+"\"" + " are not anagrams.");
    }
}

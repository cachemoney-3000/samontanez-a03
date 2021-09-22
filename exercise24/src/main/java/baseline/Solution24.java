/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {
    private String firstString;
    private String secondString;

    private static final Scanner scanner = new Scanner(System.in);

    /*
    Print "Enter two strings and I'll tell you if they are anagrams"
    PROMPT USER: "Enter the first string:"
        'firstString' will store the user input.
    PROMPT USER: "Enter the second string:"
        'secondString will store the second input from the user.

    Calls the method called 'output' and pass the first and second string:
        if the 2 strings are anagram
            Print: "<firstString> and <secondString> are anagrams."
        else
            Print: "<firstString> and <secondString> are not anagrams."
     */
    public static void main(String[] args) {
        Solution24 sol24 = new Solution24();

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        sol24.firstString =  sol24.readValueFromUser("Enter the first string: ");
        sol24.secondString = sol24.readValueFromUser("Enter the second string: ");
        sol24.output(sol24.firstString, sol24.secondString); //
    }

    //Handles all the input from the user.
    private String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /*
    isAnagram method will only return true or false:
        if (first string length is not equal to second string length)
            return 'false' value.
        else
            -compare the letters of the first and second characters
            -if they all match
                return 'true'
            -if they all don't match
                return 'false'
     */
    public static boolean isAnagram(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        else{
            char[] firstChar = first.toLowerCase().toCharArray();
            char[] secondChar = second.toLowerCase().toCharArray();
            Arrays.sort(firstChar);
            Arrays.sort(secondChar);

            return Arrays.equals(firstChar, secondChar);
        }
    }

    /*
    The output method will print the final output of the program.
    if(the return value of isAnagram is true)
        Print: "<firstString> and <secondString> are anagrams."
    else
        Print: "<firstString> and <secondString> are not anagrams."
     */
    private static void output(String s1, String s2){

        if(isAnagram(s1, s2) == true){
            System.out.println("\""+s1+"\"" + " and " + "\""+s2+"\"" + " are anagrams.");
        }
        else
            System.out.println("\""+s1+"\"" + " and " + "\""+s2+"\"" + " are not anagrams.");
    }

}

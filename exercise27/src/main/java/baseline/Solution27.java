/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Arrays;
import java.util.Scanner;

public class Solution27 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompts user for the first name, stores the input to 'firstName'
        String firstName = readValueFromUser("Enter the first name: ");
        //prompts user for the last name, stores the input to 'lastName'
        String lastName = readValueFromUser("Enter the last name: ");
        //prompts user for the ZIP, stores the input to 'ZIP'
        String ZIP = readValueFromUser("Enter the ZIP code: ");
        //prompts user for employee ID, stores the input to 'ID'
        String ID = readValueFromUser("Enter the employee ID: ");

        //calls the method validateInput, pass firstName, lastName, ZIP, and ID then gets the value of the array
        Boolean[] arr = validateInput(firstName, lastName, ZIP, ID);
        //prints out the result by calling 'printOut' method and passing the 'arr'
        printOut(arr);
    }

    //Handles all the input from the user.
    private static String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static Boolean[] validateInput(String firstName, String lastName, String ZIP, String ID) {
        //boolean array will store all the result
        //if it satisfies a condition it will change depending on the condition
        Boolean[] valInputArray = new Boolean[4];
        Arrays.fill(valInputArray, Boolean.TRUE);

        //if the firstName is less than 2 chars, set valInputArray[0] to false
        if (firstName.length() < 2) {
            valInputArray[0] = false;
        }

        //if the lastName is less than 2 chars, set valInputArray[1] to false
        if (lastName.length() < 2) {
            valInputArray[1] = false;
        }

        //if the ZIP code have letters and is less than 5, set valInputArray[2] to false
        if (ZIP.matches("[a-zA-Z]+")){
            valInputArray[2] = false;
        }
        if(ZIP.length()<5){
            valInputArray[2] = false;
        }

        //if the chars of ID is equals to 7
        //check if it matches the format, then set valInputArray[3] to true if it satisfies the condition
        if (ID.length() == 7) {
            if (ID.substring(0, 2).matches("[a-zA-Z]+") &&
                    ID.charAt(2) == '-' &&
                    ID.substring(3, 7).matches("[0-9]+")) {
                valInputArray[3] = true;
            }
            //if ID doesn't match the format, set valInputArray[3] to false
            else {
                valInputArray[3] = false;
            }
        }
        //if the characters of String ID is less than or more than 7, set valInputArray[3] to false
        if (ID.length() != 7) {
            valInputArray[3] = false;
        }
        return valInputArray;
    }

    //prints out the final output by referencing the results from the validateInput method
    private static void printOut(Boolean[] input) {
        if (input[0] == false) {
            System.out.println("The first name must be at least 2 characters long.");
        }

        if (input[1] == false) {
            System.out.println("The last name must be at least 2 characters long.");
        }

        if(input[2] == false){
            System.out.println("The zipcode must be a 5 digit number.");
        }

        if (input[3] == false) {
            System.out.println("The employee ID must be in the format of AA-1234.");
        }

        if(input[0] == true && input[1] == true && input[2] == true && input[3] == true){
            System.out.println("No errors found");
        }
    }
}

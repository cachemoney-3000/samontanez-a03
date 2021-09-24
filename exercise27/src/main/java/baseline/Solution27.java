/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

public class Solution27 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution27 sol27 = new Solution27();
        String firstName, lastName, ZIP, ID;

        //prompts user for the first name, stores the input to 'firstName'
        firstName = sol27.readValueFromUser("Enter the first name: ");
        //prompts user for the last name, stores the input to 'lastName'
        lastName = sol27.readValueFromUser("Enter the last name: ");
        //prompts user for the ZIP, stores the input to 'ZIP'
        ZIP = sol27.readValueFromUser("Enter the ZIP code: ");
        //prompts user for employee ID, sotres the input to 'ID'
        ID = sol27.readValueFromUser("Enter the employee ID: ");

        //calls the method validateInput, pass firstName, lastName, ZIP, and ID then prints the output.
        validateInput(firstName, lastName, ZIP, ID);

    }

    //Handles all the input from the user.
    private String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void validateInput(String firstName, String lastName, String ZIP, String ID) {
        //fNameBool, lNameBool, ZIPbool, IDbool all set to true
        //if it satisfies a condition it will change depending on the condition
        boolean fNameBool = true,
                lNameBool = true,
                ZIPbool = true,
                IDbool = true;

        //if the firstName is less than 2 chars, set fNameBool to false, and print an output
        if (firstName.length() < 2) {
            fNameBool = false;
            System.out.println("The first name must be at least 2 characters long.");
        }

        //if the lastName is less than 2 chars, set lNameBool to false, and print an output
        if (lastName.length() < 2) {
            lNameBool = false;
            System.out.println("The last name must be at least 2 characters long.");
        }

        //if the ZIP code have letters, set ZIPbool to false, and print an output
        if (ZIP.matches("[a-zA-Z]+")){
            ZIPbool = false;
            System.out.println("The zipcode must be a number.");
        }
        //if the length of ZIP chars is less than 5, set ZIPbool to false, then print an output
        if(ZIP.length()<5){
            System.out.println("The zipcode must be a 5 digit number.");
            ZIPbool = false;
        }

        //if the chars of ID is equals to 7
        //check if it matches the format, then set IDbool to true if it satisfies the condition
        if (ID.length() == 7) {
            if (ID.substring(0, 2).matches("[a-zA-Z]+") &&
                    ID.charAt(2) == '-' &&
                    ID.substring(3, 7).matches("[0-9]+")) {
                IDbool = true;
            }
            //if ID doesn't match the format, set IDbool to false, then print an output
            else {
                IDbool = false;
                System.out.println("The employee ID must be in the format of AA-1234.");
            }
        }
        //if the characters of String ID is less than or more than 7, set IDbool to false, then print an output
        if (ID.length() < 7 || ID.length() > 7) {
            IDbool = false;
            System.out.println("The employee ID must contain 7 characters.");
        }
        //If fNameBool, lNameBool, ZIPbool, and IDbool are still true, then no errors are found.
        if(fNameBool == true && lNameBool == true && ZIPbool == true && IDbool == true){
            System.out.println("No errors found");
        }

    }
}

//This class will be used for unit testing
//The methods used and the conditions are based on the class 'validateInput'
class Solution27Testing{
    //will test the firstName: if the length < 2, return false. If not return true.
    public boolean firstNameTest(String firstName){
        if (firstName.length() < 2)
            return false;
        else
            return true;
    }
    //will test the lastName: if the length < 2, return false. If not return true.
    public boolean lastNameTest(String lastName){
        if (lastName.length() < 2)
            return false;
        else
            return true;
    }
    //will test the String ID
    public boolean IDTest(String ID){
        //if the ID length follows the format, it will return true, if not it will return false
        if (ID.length() == 7) {
            if (ID.substring(0, 2).matches("[a-zA-Z]+") &&
                    ID.charAt(2) == '-' &&
                    ID.substring(3, 7).matches("[0-9]+")) {
                 return true;
            }
            else
                return false;
        }
        //if the length of ID, is greater or less than 7 chars, return false
        if (ID.length() < 7 || ID.length() > 7)
            return false;

        else
            return true;
    }
    //will test the ZIP String
    public boolean ZIPTest(String ZIP){
        if (ZIP.matches("[a-zA-Z]+")){
            return false;
        }
        //if the length of ZIP chars is less than 5, set ZIPbool to false, then print an output
        else if(ZIP.length()<5){
            return false;
        }
        else
            return true;
    }
}

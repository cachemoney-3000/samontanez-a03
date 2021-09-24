/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

public class Solution27 {
    private static final Scanner scanner = new Scanner(System.in);

    /*
    Prompt: "Enter the first name:"
        'firstName' stores input
    Prompt: "Enter the last name:"
        'lastName' stores input
    Prompt: "Enter the ZIP code:"
        'ZIP' stores the input
    Prompt: "Enter the employee ID:"
        'ID' stores the input

    Call the method validateInput, pass the firstName, lastName, ZIP, and ID. Then prints out the output.
     */
    public static void main(String[] args) {
        Solution27 sol27 = new Solution27();
        String firstName = sol27.readValueFromUser("Enter the first name: ");
        String lastName = sol27.readValueFromUser("Enter the last name: ");
        String ZIP = sol27.readValueFromUser("Enter the ZIP code: ");
        String ID = sol27.readValueFromUser("Enter the employee ID: ");

        validateInput(firstName, lastName, ZIP, ID);

    }

    //Handles all the input from the user.
    private String readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /*
    validateInput method:
        boolean fNameBool, lNameBool, ZIPbool, IDbool = initialize to true
            if firstName length < 8{
                fNameBool = false
                print: "first name must contain at least 2 characters"
                }
            if lastName length < 8{
                lNameBool = false
                print: "Last name must contain at least 2 characters"
                }

            if ZIP contains a letter{
                Zipbool = false
                print: "ZIP code must be a number"
                }
            if length of ZIP < 5{
                Zipbool = false
                print: "Zip code must be at least 5 digits"
                }

            if ID doesn't follow format (AA-1234){
                IDbool = false
                print: "ID must follow the format AA-1234"
                }
            if ID is shorter or longer than 7 characters{
                IDbool = false
                print: "ID must only be 7 characters"
                }

            If(fNameBool, lNameBool, ZIPbool, IDbool = all true)
                Print: "No errors found"
     */
    public static void validateInput(String firstName, String lastName, String ZIP, String ID) {
        boolean fNameBool = true;
        boolean lNameBool = true;
        boolean ZIPbool = true;
        boolean IDbool = true;

        if (firstName.length() < 2) {
            fNameBool = false;
            System.out.println("The first name must be at least 2 characters long.");
        }
        if (lastName.length() < 2) {
            lNameBool = false;
            System.out.println("The last name must be at least 2 characters long.");
        }
        if (ZIP.matches("[a-zA-Z]+")){
            ZIPbool = false;
            System.out.println("The zipcode must be a number.");
        }
        if(ZIP.length()<5){
            System.out.println("The zipcode must be a 5 digit number.");
            ZIPbool = false;
        }

        if (ID.length() == 7) {
            if (ID.substring(0, 2).matches("[a-zA-Z]+") &&
                    ID.charAt(2) == '-' &&
                    ID.substring(3, 7).matches("[0-9]+")) {
                IDbool = true;
            }
            else {
                IDbool = false;
                System.out.println("The employee ID must be in the format of AA-1234.");
            }
        }
        if (ID.length() < 7 || ID.length() > 7) {
            IDbool = false;
            System.out.println("The employee ID must contain 7 characters.");
        }

        if(fNameBool == true && lNameBool == true && ZIPbool == true && IDbool == true){
            System.out.println("No errors found");
        }

    }

    public boolean validateInputTest(String firstName, String lastName, String ZIP, String ID){
        boolean fNameBool = true;
        boolean lNameBool = true;
        boolean ZIPbool = true;
        boolean IDbool = true;
        boolean pass = false;

        if (firstName.length() < 2) {
            fNameBool = false;
        }
        if (lastName.length() < 2) {
            lNameBool = false;
        }
        if (ZIP.matches("[a-zA-Z]+")){
            ZIPbool = false;
        }
        if(ZIP.length()<5){
            ZIPbool = false;
        }

        if (ID.length() == 7) {
            if (ID.substring(0, 2).matches("[a-zA-Z]+") &&
                    ID.charAt(2) == '-' &&
                    ID.substring(3, 7).matches("[0-9]+")) {
                IDbool = true;
            }
            else {
                IDbool = false;
            }
        }
        if (ID.length() < 7 || ID.length() > 7) {
            IDbool = false;
        }

        if(fNameBool == true && lNameBool == true && ZIPbool == true && IDbool == true)
            return true;
        else
            return false;
    }
}



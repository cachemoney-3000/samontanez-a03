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
     */

    /*
    validateInput method:
        boolean fNameBool, lNameBool, ZIPbool, IDbool = initialize to true
            if firstName length < 8:
                fNameBool = false
            if lastName length < 8:
                lNameBool = false
            if ZIP contains a letter:
                Zipbool = false
            if ID doesn't follow format (AA-1234):
                IDbool = false

            If(fNameBool, lNameBool, ZIPbool, IDbool = all true)
                Print: "No errors found"        
     */
}

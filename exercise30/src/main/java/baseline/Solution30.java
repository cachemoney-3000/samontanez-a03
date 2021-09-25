/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

public class Solution30 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Solution30 sol30 = new Solution30();
        //create a method that will print the multiplication table
        //call the method to print out the whole table
        sol30.multiplicationTable();
    }

    //method that will print multiplication table
    public static void multiplicationTable() {
        //the outer loop will loop from 1 to 12
        for (int i = 1; i <= 12; i++) {
            //inner loop will loop until 12
            for (int j = 1; j <= 12; j++) {
                //multiply i*j
                //print the result
                //move to the next number
            }
        }
    }
}


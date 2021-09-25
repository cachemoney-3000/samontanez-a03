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
        int i = 0, j = 0;
        //call the method to print out the whole table
        sol30.multiplicationTable(i,j);
    }

    //create a method that will print the multiplication table using nested loops
    public static void multiplicationTable(int i, int j) {
        //the outer loop will loop from 1 to 12
        for (i = 1; i <= 12; i++) {
            //inner loop will also loop up to 12
            for (j = 1; j <= 12; j++) {
                //multiply i*j
                int multiply = i*j;
                //print the result,
                System.out.format("%5d",multiply);
                //move to the next number
            }
            System.out.println();
        }
    }


}


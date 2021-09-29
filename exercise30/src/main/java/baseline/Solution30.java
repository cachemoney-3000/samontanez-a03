/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
/*
* Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
 */

public class Solution30 {

    public static void main(String[] args){
        int i = 0;
        int j = 0;
        //call the method to print out the whole table
        multiplicationTable(i,j);
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

class test {
    //Method for unit testing. The code is based on the multiplicationTable method
    public static int multiplicationTableTest(int i, int j) {
        //used an array to know the value when multiplying 2 numbers between 1-12 inclusive
        int[][] multiply = new int[13][13];
        //the outer loop will loop from 1 to 12
        for (int a = 1; a <= i; a++) {
            //inner loop will also loop up to 12
            for (int b = 1; b <= j; b++) {
                //multiply i*j
                multiply[a][b] = a*b;
            }
        }
        return multiply[i][j];
    }
}



/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.ArrayList;
import java.util.*;

/*
* Create a program that prompts for a list of numbers, separated by spaces.
* Have the program print out a new list containing only the even numbers.
 */

public class Solution38 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompts user asking to enter a number separated by spaces
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = scanner.nextLine();

        //calls the filterEvenNumber function and passing the numberList array
        Integer[] evenNum = filterEvenNumbers(numbers);
        //prints out the result
        output(evenNum);
    }

    //method responsible for filtering the even numbers
    public static Integer[] filterEvenNumbers(String numbers) {
        //splits the numbers in the strings separated by spaces
        String[] numberList = numbers.split(" ");
        //declare an empty array list of Integer
        ArrayList<Integer> evenNum = new ArrayList<>();

        //loop through the list to find the even numbers
        for (String s : numberList) {
            //try parse-ing the string into the integer
            try {
                //convert the string into integer
                int num = Integer.parseInt(s);
                //check if the number is even number
                if (num % 2 == 0) {
                    //then add it into the list
                    evenNum.add(num);
                }
            }
            //catch inputs that throws a number format exception
            catch (NumberFormatException e) {
                System.out.println("Your list contains a non-numeric character/s.");
            }
        }

        //convert the array list to an integer array
        Integer[] arr = new Integer[evenNum.size()];
        arr = evenNum.toArray(arr);

        //return Integer array
        return arr;
    }

    //method responsible for printing the output
    private static void output(Integer[] evenNumList) {
        //prints out the even numbers
        System.out.print("The even numbers are ");
        for (int i = 0; i < evenNumList.length; i++) {
            if (i < evenNumList.length - 1) {
                System.out.print(evenNumList[i] + " ");
            } else {
                System.out.print(evenNumList[i] + ".");
            }
        }
    }
}

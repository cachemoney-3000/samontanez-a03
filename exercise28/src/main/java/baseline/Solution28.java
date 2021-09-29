/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
/*
* Write a program that prompts the user for five numbers
* Computes the total of the numbers.
 */
import java.util.Scanner;

public class Solution28 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = {0,0,0,0,0};
        //for loop that loops until 5 numbers was entered
        for(int i = 0; i < 5; i++){
            //prompts user to enter a number
            //store the input to array of num
            num[i] = readValueFromUser("Enter a number: ");
        }

        //calls the method that calculates the total sum
        int sumTotal = sum(num);
        //prints out the final output
        System.out.println("The total is " + sumTotal);
    }

    //Handles all the input from the user.
    private static int readValueFromUser(String prompt) {
        System.out.print(prompt);
        //Do not accept input that is not a number
        while(!scanner.hasNextInt()){
            System.out.println(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    //to make it easier for unit testing
    //uses the array num as an input
    public static int sum(int[] numbers){
        int total = 0;

        //loops through all the inputs and add them all
        for(int number : numbers){
            //'total' will add the numbers as they were entered by the user
            total += number;
        }
        return total;
    }
}



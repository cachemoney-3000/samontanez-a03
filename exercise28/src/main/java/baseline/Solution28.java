/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

public class Solution28 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution28 sol28 = new Solution28();

        //prints out the final output
        System.out.println("The total is " + sol28.solve());
    }

    //Handles all the input from the user.
    private int readValueFromUser(String prompt) {
        System.out.print(prompt);
        //Do not accept input that is not a number
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a number");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int solve(){
        //initialize num to zero
        int[] num = {0,0,0,0,0};
        int total = 0;
        //for loop that loops until 5 numbers was entered
        for(int i = 0; i < 5; i++){
            //prompts user to enter a number
            //store the input to array of num
            num[i] = readValueFromUser("Enter a number: ");
        }

        //prints the total
        return (sum(num));
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



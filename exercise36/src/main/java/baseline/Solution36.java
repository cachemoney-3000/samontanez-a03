/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
/*
 * Write a program that prompts for response times from a website in milliseconds.
 * It should keep asking for values until the user enters done.
 * The program should print the average time (mean),
 * the minimum time,
 * the maximum time,
 * and the population standard deviation.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution36 {
    private static final Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> number;

    //constructor that will store the inputs
    public Solution36(){
        number = new ArrayList<>();
    }

    public static void main(String[] args) {
        Solution36 sol36 = new Solution36();

        //call the input method to prompt the user
        sol36.input("Enter a number: ");
        //call the output method to print te results
        sol36.output(sol36.number);
    }

    private void input(String prompt){
        String inputStr;
        //keep loping until user entered "done"
        do {
            //prompt user to enter a number
            System.out.print(prompt);
            inputStr = scanner.nextLine();

            if (!inputStr.equals("done")) {
                //try to convert a string into a double
                addNumber(inputStr);
            }
        }
        while(!inputStr.equals("done"));
    }

    //method that will convert the string to int then add them to the list
    public void addNumber(String in){
        try {
            int num = Integer.parseInt(in);
            //add the converted numbers to the array
            number.add(num);
        } catch (NumberFormatException error) {
            //do nothing if the string can't be converted to int
        }
    }

    //method that will calculate the minimum time
    public static int min(ArrayList<Integer> number) {
        //set the min to the first number in the array
        int min = number.get(0);
        //loop until the last index to find the min
        for(int num: number) {
            //keep changing the values until the min number is found
            if(num < min)
                min = num;
        }
        return min;
    }

    //method that will calculate maximum time
    public static int max(ArrayList<Integer> number){
        //set max to the first number in the array
        int max= number.get(0);
        //loop through the array to find the max number
        for(int num: number) {
            //keep changing the values until the max number is found
            if(num > max)
                max = num;
        }
        return max;
    }

    //method that will calculate average time
    public static double average(ArrayList<Integer> number) {
        //initialize total to 0
        double total = 0;
        double avg;
        //loops through the array and add all the numbers
        for(int i = 0; i < number.size(); i++){
            total += number.get(i);
        }
        //get the average by dividing the total to the size of the array
        avg = total/number.size();
        return avg;
    }

    //method that will calculate the standard deviation
    public static double std(ArrayList<Integer> number){
        //call the average method, store the value to 'mean'
        double mean = average(number);
        //initialize sum to 0
        double sum = 0;
        //loops through the array
        for(double num: number) {
            sum = sum + Math.pow((num-mean), 2);
        }
        //calculate the standard deviation
        double standardDeviation = Math.sqrt(sum/number.size());

        return Math.floor(standardDeviation * 100)/ 100;
    }

    //method that will print out an output
    private void output(ArrayList<Integer> number){
        //prints the list of the input numbers
        System.out.println("Numbers: "+ number.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        //print the avg
        System.out.println("The average is "+ average(number));
        //print the min
        System.out.println("The minimum is "+ min(number));
        //print the max
        System.out.println("The maximum is "+ max(number));
        //print the standard deviation
        System.out.println("The standard deviation is " + std((number)));

    }
}
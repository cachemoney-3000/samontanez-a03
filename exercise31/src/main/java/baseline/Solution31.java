/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt user to enter how old they are
        //store input to 'age'
        //loop prompt until the input is valid
        while (age < 1) {

        }

        //prompt user to enter what is their resting pulse
        //store input to 'restingHR'
        //loop prompt until the input is valid, only accept if it falls to the range 55% - 95%
        while (restingHR < 55 || restingHR > 95) {

        }

        //call the rateCalc method and store the value to 'heartRate'
        //call the output method to print the result

    }
        //method that will take care of calculation
        public double rateCalc(){
            //do the calculations here
            double TargetHeartRate  = (((220 − age) − restingHR) × intensity) + restingHR;
            //return the TargetHeartRate valud
        }

        //method that will prints out the result


    }


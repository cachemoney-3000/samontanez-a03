/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Arrays;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Solution31 sol31 = new Solution31();
        int age = 0;
        int restingHR = 0;

        //prompt user to enter how old they are
        //loop prompt until the input is valid
        do {
            System.out.print("Enter age: ");
            age = scanner.nextInt();
        }
        while(age < 1);

        //prompt user to enter what is their resting pulse
        //loop prompt until the input is valid (valid range: 55% - 95%)
        do{
            System.out.print("Resting Pulse: ");
            restingHR = scanner.nextInt();
        }
        while (restingHR < 55 || restingHR > 95);

        //call the rateCalc method and store the value to 'heartRate'
        double[] targetArr = sol31.rateCalc(age, restingHR);
        //call the output method to print the result
        sol31.output(targetArr);
    }
        //method that will take care of calculation
        public double[] rateCalc(int age, int restingHR){
            int intensity;
            double[] TargetHeartRate = new double[100];
            Arrays.fill(TargetHeartRate, 0);
            //do the calculations here
            for(intensity = 55; intensity <= 95; intensity += 5){
                TargetHeartRate[intensity] = (((220 - age) - restingHR) * (intensity/100.0)) + restingHR;
            }

            return TargetHeartRate;
        }

        //method that will print out the result
        private void output(double[] target){
            int intensity;
            System.out.println("\n Intensity \t|   Rate");
            System.out.println("-------------------------");
            for(intensity = 55; intensity <= 95; intensity += 5){
                System.out.println("   " + intensity + "%" + "\t\t|\t" + (int)(target[intensity]) + " bpm");
            }
        }
    }


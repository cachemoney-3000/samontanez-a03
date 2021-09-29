/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.Scanner;

class Solution26 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance, APR, payment;
        //prompts the user for balance and stores the input to 'balance'
        balance = readValueFromUser("What is the balance? ");
        //prompts the user for APR and stores the input to 'APR'
        APR = readValueFromUser("What is the APR on the card (as a percent)? ");
        //prompts the user for payment and stores the input to 'payment'
        payment = readValueFromUser("What is the monthly payment you can make? ");

        //call the output method to print the final result
        output(balance, APR, payment);
    }

    //Handles all the input from the user.
    private static double readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void output(double balance, double APR, double payment){
        //create an object for paymentCalculator
        PaymentCalculator months = new PaymentCalculator();
        //'n' stores the return value of the calculateMonthsUntilPaiOff method
        int n = (int)Math.ceil(months.calculateMonthsUntilPaidOff(APR, balance, payment));
        //prints out the final result using the int 'n' (months)
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}

class PaymentCalculator{
    public double calculateMonthsUntilPaidOff(double APR, double balance, double payment){
        double months;
        //rate will convert APR from percent to decimal then divided it by 365
        double rate = APR/36500.0;
        //'months' stores the formula for how many months the balance will need to be paid
        months = (-(1.0/30.0) * (Math.log(1 + ((balance/payment) * (1 - (Math.pow((1 + rate), 30)))))))
                /(Math.log(1 + rate));
        //return the number of 'months'
        return months;
    }
}

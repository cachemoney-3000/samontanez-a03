/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

class Solution26 {
    private static final Scanner scanner = new Scanner(System.in);
    /*
        Prompt user: "What is the balance?"
            balance = stores the user input.
        Prompt user: "What is the APR on the card (as a percent)?"
            APR = stores the user input
        Prompt user: "What is the monthly payment you can make?"
            payment = stores the user input
        call the output method to print the result.
    */
    public static void main(String[] args) {
        double balance, APR, payment;
        Solution26 sol26 = new Solution26();

        balance = sol26.readValueFromUser("What is the balance? ");
        APR = sol26.readValueFromUser("What is the APR on the card (as a percent)? ");
        payment = sol26.readValueFromUser("What is the monthly payment you can make? ");

        output(balance, APR, payment);
    }

    //Handles all the input from the user.
    private double readValueFromUser(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    /*
    output:
    Prints the final result:
        Create an object for PaymentCalculator
        'n' = stores the return value when the calculateMonthsUntilPaidOff method was called
        "It will take you <n> months to pay off this card."
     */
    private static void output(double balance, double APR, double payment){
        PaymentCalculator months = new PaymentCalculator();
        int n = (int)Math.ceil(months.calculateMonthsUntilPaidOff(APR, balance, payment));

        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}

class PaymentCalculator{
    /*
    calculateMonthsUntilPaidOff method:
        'rate' = APR/36500.0 (convert APR percent to decimal then divide by 365)
        'months' = -(1/30) * log(1 + balance/payment * (1 - (1 + APR)^30)) / log(1 + APR)
        Returns the number of 'months'.
    */
    public double calculateMonthsUntilPaidOff(double APR, double balance, double payment){
        double months;
        double rate = APR/36500.0;

        months = (-(1.0/30.0) * (Math.log(1 + ((balance/payment) * (1 - (Math.pow((1 + rate), 30)))))))
                /(Math.log(1 + rate));
        return months;
    }


}

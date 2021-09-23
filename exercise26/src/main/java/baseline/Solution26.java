/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;


public class Solution26 {

    /*
    Main:
        Prompt user: "What is the balance?"
            balance = stores the user input.
        Prompt user: "What is the APR on the card (as a percent)?"
            APR = stores the user input
        Prompt user: "What is the monthly payment you can make?"
            payment = stores the user input
        call the output method to print the result.
    */

    /*
    PaymentCalculator class
        calculateMonthsUntilPaidOff method:
            'n' = -(1/30) * log(1 + balance/payment * (1 - (1 + APR)^30)) / log(1 + APR)
            returns the number of months ('n')
     */

    /*
    output:
    Prints the final result:
        "It will take you <n> months to pay off this card."
     */
}

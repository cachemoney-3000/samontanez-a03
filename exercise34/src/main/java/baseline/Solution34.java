/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;
import java.util.Scanner;

/*
 * Create a small program that contains a list of employee names.
 * Print out the list of names when the program runs the first time.
 * Prompt for an employee name and remove that specific name from the list of names.
 * Display the remaining employees, each on its own line.
 */

public class Solution34 {
    //array to store the name of employees
    private final String[] employees;
    private int totalEmployees;

    private static final Scanner scanner = new Scanner(System.in);

    //constructor to store the list of names
    public Solution34() {
        employees = new String[7];
        employees[0] = "Kanye West";
        employees[1] = "Chancellor Bennet";
        employees[2] = "Rakim Mayers";
        employees[3] = "Tyler Gregory Okonma";
        employees[4] = "Frank Ocean";
        employees[5] = "Jacques Bermon Webster II";
        employees[6] = "Aubrey Drake Graham";
        totalEmployees = employees.length;
    }

    public static void main(String[] args) {
        Solution34 sol34 = new Solution34();
        String employeeToRemove;
        int index;

        //prints how many employees
        System.out.println("There are " + sol34.totalEmployees + " employees:");
        //prints the list of names
        System.out.println(sol34.employeeList());

        //prompts the user to enter a name to remove
        System.out.print("Enter an employee name to remove: ");
        employeeToRemove = scanner.nextLine();

        //converts the name to index, so they can be removed from the list
        index = sol34.removeEmployeeIndex(employeeToRemove);
        //prints out the final output
        System.out.println(sol34.indexToRemove(index));
    }

    //method responsible for printing the employee list
    private String employeeList() {
        String list = "";
        //loops until the last index of 'employees' array
        for (int i = 0; i < totalEmployees; i++) {
            //prints out the list
            list += employees[i] + "\n";
        }
        return list;
    }

    //method responsible for converting the employee name to index
    public int removeEmployeeIndex(String employeeRemove) {
        int index = -1;
        int employeeCounter = totalEmployees;
        boolean found = false;

        //loops through the employees array
        for (int i = 0; i < totalEmployees; i++) {
            //if the String 'employeeRemove' matched with the names on the list
            //return the index number where it matched
            if (employees[i].equals(employeeRemove)) {
                index = i;
                employeeCounter = totalEmployees - 1;
                found = true;
            }
        }

        //prints an additional line if the employee can't be found
        if(found == false){
            System.out.println("\nEmployee not found!");
        }

        //prints out how many employees left
        System.out.println("\nThere are " + (employeeCounter) + " employees:");

        return index;
    }

    //responsible for printing the remaining employees
    public String indexToRemove(int removeUsingIndex) {
        String list = "";

        //loops through the array to find that index
        for (int i = 0; i < totalEmployees; i++) {
            //if the index is found, ignore it
            if (i == removeUsingIndex) {
                continue;
            }
            //prints the employees that is not ignored
            list += employees[i] + "\n";
        }
        return list;
    }
}
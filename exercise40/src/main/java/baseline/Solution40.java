/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.*;
/*
* Given the following data set create a program that lets a user
* locate all records that match the search string by comparing
* the search string to the first or last name field.
 */

public class Solution40 {
    //instance variable for storing the array of employees
    ArrayList<Solution40> employeeList = new ArrayList<>();
    //constructor that helps store the data correctly
    public Solution40(String firstName, String lastName, String position, String separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public static void main(String[] args) {

    }

    //getters and setters

    //method that will prints out the pre-searched list
    public static void employeeList(){

    }
    //method that will prints out the searched list
    public static void searchedList(){

    }
    //method for searching
    public static void searching(){
        
    }
}

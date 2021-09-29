/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Given the following data set,
* create a program that sorts all employees by last name
* prints them to the screen in a tabular format.
 */
public class Solution39 {
    //make an instance variables that would help to sort data
    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    //constructor that sort and store the data
    public Solution39(String firstName, String lastName, String position, String separationDate){

    }

    //constructor to store the given data set
    public Solution39(){
        List<Solution39> employeeList = new ArrayList<>();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    //get the first name
    public String getFirstName(){
        return firstName;
    }

    //set the first name
    public void setFirstName(){
        this.firstName = firstName;
    }

    //get the last name
    public String getLastName(){
        return lastName;
    }

    //set the last name

    //get the position
    public String getPosition(){
        return position;
    }

    //set the position

    //get the separation date
    public String getSeparationDate(){
        return separationDate;
    }

    //set the separation date

    //method that will sort out the data base on their names
    public static void sortData(String firstName, String lastName){

    }
}

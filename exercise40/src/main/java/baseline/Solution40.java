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

public class Solution40 implements Comparable<Solution40>{
   //instance variables
    private final String firstName;
    private final String lastName;
    public final String fullName;
    public final String position;
    public final String separationDate;

    //constructor that helps store the data correctly
    public Solution40(String firstName, String lastName, String position, String separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    //method responsible for distributing the data to the correct variable in the constructor
    public static ArrayList<Solution40> storeData(){
        //instance variable for storing the array of employees
        ArrayList<Solution40> employeeList = new ArrayList<>();
        //add the employees' information to the list
        employeeList.add(new Solution40("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Solution40("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Solution40("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Solution40("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Solution40("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Solution40("Sally", "Webber", "Web Developer", "2015-12-18"));

        return employeeList;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //prompts user to enter a name to search
        System.out.print("Enter a search string: ");
        String search = scanner.nextLine();

        System.out.println("\nResults: \n");
        //prints out the header with formatting
        System.out.println(header());

        //prints out the final results with formatting
        //calls the searching method and passing String 'search' to compare the names
        System.out.println(searching(search));
    }

    //gets the full name of the employee
    public String getFirstName(){
        return firstName;
    }

    //gets the full name of the employee
    public String getLastName(){
        return lastName;
    }

    //gets the full name of the employee
    public String getFullName(){ return fullName; }

    //get the position
    public String getPosition(){
        return position;
    }

    //get the separation date
    public String getSeparationDate(){
        return separationDate;
    }

    //prints out the header
    private static String header(){
        return (String.format("%-25s| %-30s| %s\n" +
                        "-----------------------------------------------------------------------------",
                "Name", "Position", "Separation Date"));
    }


    //compares and sort the data according to their last name
    public static ArrayList<Solution40> sort(ArrayList<Solution40> list){
        Collections.sort(list);
        return list;
    }
    @Override
    public int compareTo(Solution40 employee){
        return this.lastName.compareTo(employee.lastName);
    }

    //method for searching and printing out the results
    public static String searching(String nameSearch) {
        ArrayList<Solution40> employeeUnsorted = storeData();
        ArrayList<Solution40> employeeSorted = sort(employeeUnsorted);

        String result = "";



        for (Solution40 employee : employeeSorted) {
            if (employee.getFirstName().toLowerCase().contains(nameSearch.toLowerCase()) ||
                employee.getLastName().toLowerCase().contains(nameSearch.toLowerCase())) {
                result += String.format("%-25s| %-30s| %s", employee.getFullName(), employee.getPosition(),
                        (employee.getSeparationDate() == null ? "" : employee.getSeparationDate())) + "\n";
            }
        }
        return result;
    }
}

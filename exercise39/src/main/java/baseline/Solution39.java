/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Samontanez
 */
package baseline;

import java.util.*;
/*
 * Given the following data set,
 * create a program that sorts all employees by last name
 * prints them to the screen in a tabular format.
 */
public class Solution39 implements Comparable<Solution39> {
    //make an instance variables that would help to sort data
    private final String firstName;
    private final String lastName;
    public final String fullName;
    public final String position;
    public final String separationDate;

    //constructor that stores the data
    public Solution39(String firstName, String lastName, String position, String separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    //method responsible for distributing the data to the correct variable in the constructor
    public static ArrayList<Solution39> storeData(){
        ArrayList<Solution39> employeeList = new ArrayList<>();
        //add the employees' information to the list
        employeeList.add(new Solution39("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Solution39("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Solution39("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Solution39("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Solution39("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Solution39("Sally", "Webber", "Web Developer", "2015-12-18"));

        return employeeList;
    }

    public static void main(String[] args) {
        //a list that stores the return value of the method sortData
        ArrayList<Solution39> employeeUnsorted = storeData();
        ArrayList<Solution39> employeeSorted = sort(employeeUnsorted);

        //prints out the header
        System.out.println(header());
        //prints out the sorted employees and their info
        for (Solution39 employee : employeeSorted) {
            System.out.println(output(employee));
        }
    }

    //gets the full name of the employee
    public String getFullName(){
        return fullName;
    }

    //get the position
    public String getPosition(){
        return position;
    }

    //get the separation date
    public String getSeparationDate(){
        return separationDate;
    }


    //compares and sort the data according to their last name
    public static ArrayList<Solution39> sort(ArrayList<Solution39> list){
        Collections.sort(list);
        return list;
    }
    @Override
    public int compareTo(Solution39 employee){
        return this.lastName.compareTo(employee.lastName);
    }

    //prints out the header
    private static String header(){
        return (String.format("%-25s| %-30s| %s\n" +
                        "-----------------------------------------------------------------------------",
                "Name", "Position", "Separation Date"));
    }

    //prints out the sorted names of the employees
    public static String output(Solution39 employee){
        return String.format("%-25s| %-30s| %s", employee.getFullName(), employee.getPosition(),
                (employee.getSeparationDate()== null ? "" : employee.getSeparationDate()));

    }
}
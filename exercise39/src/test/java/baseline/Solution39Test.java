package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    public void verifyPrintedValues() {
        //testing an unsorted list
        ArrayList<Solution39> employeeUnsorted = initializeEmployees();
        ArrayList<Solution39> employeeSorted = Solution39.sort(employeeUnsorted);

        String value ="";
        for (Solution39 employee: employeeSorted) {
            value += String.format("%-25s| %-30s| %s", employee.fullName, employee.position,
                    (employee.separationDate == null ? "" : employee.separationDate)) + "\n";
        }

        String actual = value;
        String expected =   "Jacquelyn Jackson        | DBA                           | \n" +
                            "Jake Jacobson            | Programmer                    | \n" +
                            "John Johnson             | Manager                       | 2016-12-31\n" +
                            "Michaela Michaelson      | District Manager              | 2015-12-19\n" +
                            "Sally Webber             | Web Developer                 | 2015-12-18\n" +
                            "Tou Xiong                | Software Engineer             | 2016-10-05\n"
                            ;;

        assertEquals(actual,expected);

    }


    private ArrayList<Solution39> initializeEmployees() {
        ArrayList<Solution39> employees = new ArrayList<>();
        employees.add(new Solution39("John", "Johnson", "Manager", "2016-12-31"));
        employees.add(new Solution39("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employees.add(new Solution39("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employees.add(new Solution39("Jake", "Jacobson", "Programmer", ""));
        employees.add(new Solution39("Jacquelyn", "Jackson", "DBA", ""));
        employees.add(new Solution39("Sally", "Webber", "Web Developer", "2015-12-18"));

        return employees;
    }
}


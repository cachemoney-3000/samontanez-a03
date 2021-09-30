package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    public void verifyPrintedValues() {
        //calls the unsorted list
        ArrayList<Solution39> employeeUnsorted = Solution39.storeData();
        //sort the list
        ArrayList<Solution39> employeeSorted = Solution39.sort(employeeUnsorted);

        String value = "";
        //prints out the actual sorted list
        for (Solution39 employee : employeeSorted) {
            value += String.format("%-25s| %-30s| %s", employee.fullName, employee.position,
                    (employee.separationDate == null ? "" : employee.separationDate)) + "\n";
        }

        String actual = value;
        String expected = "Jacquelyn Jackson        | DBA                           | \n" +
                "Jake Jacobson            | Programmer                    | \n" +
                "John Johnson             | Manager                       | 2016-12-31\n" +
                "Michaela Michaelson      | District Manager              | 2015-12-19\n" +
                "Sally Webber             | Web Developer                 | 2015-12-18\n" +
                "Tou Xiong                | Software Engineer             | 2016-10-05\n";
        ;

        //compares the 2 results
        assertEquals(actual, expected);

    }
}


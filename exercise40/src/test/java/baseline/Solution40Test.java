package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {
    @Test
    public void verifyPrintedValues() {
        //testing an unsorted list
        String search = "jac";

        String actual = Solution40.searching(search);

        String expected =   "Jacquelyn Jackson        | DBA                           | \n" +
                "Jake Jacobson            | Programmer                    | \n"
                ;

        assertEquals(actual,expected);

    }

    @Test
    public void verifyPrintedValues1() {
        //testing an unsorted list
        String search = "jac";

        String actual = Solution40.searching(search);

        String expected =   "Jacquelyn Jackson        | DBA                           | \n" +
                "Jake Jacobson            | Programmer                    | \n"
                ;

        assertEquals(actual,expected);

    }

    @Test
    public void verifyPrintedValues2() {
        //testing an unsorted list
        String search = "web";

        String actual = Solution40.searching(search);

        String expected =   "Sally Webber             | Web Developer                 | 2015-12-18\n";

        assertEquals(actual,expected);

    }
}
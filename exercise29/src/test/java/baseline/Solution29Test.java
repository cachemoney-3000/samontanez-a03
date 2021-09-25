package baseline;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test //tests whether the input can pass the conditions
    void test1() {
        Solution29 sol29 = new Solution29();

        boolean actual = sol29.isValid("4");
        assertEquals(true, actual);
    }
    @Test //tests whether the input can pass the conditions
    void test2() {
        Solution29 sol29 = new Solution29();

        boolean actual = sol29.isValid("0");
        assertEquals(false, actual);
    }
    @Test //tests whether the input can pass the conditions
    void test3() {
        Solution29 sol29 = new Solution29();

        boolean actual = sol29.isValid("ABC");
        assertEquals(false, actual);
    }

    @Test //tests whether the program will give a correct output
    void test4() {
        Solution29 sol29 = new Solution29();

        int expected = 72/4; //comes from y = 72/r
        int actual = sol29.output(4);
        assertEquals(expected, actual);
    }
}
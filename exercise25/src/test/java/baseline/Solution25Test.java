package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator1() {
        Solution25 sol25 = new Solution25();

        String expected = "very weak";
        String actual = sol25.passwordValidator("12345");

        assertEquals(expected, actual);
    }

    void passwordValidator2() {
        Solution25 sol25 = new Solution25();

        String expected = "weak";
        String actual = sol25.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }

    void passwordValidator3() {
        Solution25 sol25 = new Solution25();

        String expected = "strong";
        String actual = sol25.passwordValidator("abc123xyz");

        assertEquals(expected, actual);
    }

    void passwordValidator4() {
        Solution25 sol25 = new Solution25();

        String expected = "very strong";
        String actual = sol25.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }
}
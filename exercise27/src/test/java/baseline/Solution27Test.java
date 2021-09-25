package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputTest1() {
        Solution27 s = new Solution27();
        Boolean[] expected = s.validateInput("Joshua", "Samontanez", "00000", "AA-1234");
        Boolean[] actual = {true, true, true, true};
        assertArrayEquals(expected, actual);
    }

    @Test
    void validateInputTest2() {
        Solution27 s = new Solution27();
        Boolean[] expected = s.validateInput("J", " ", "ABCDE", "12-1234");
        Boolean[] actual = {false, false, false, false};
        assertArrayEquals(expected, actual);
    }

    @Test
    void validateInputTest3() {
        Solution27 s = new Solution27();
        Boolean[] expected = s.validateInput("Joshua", "S", "33333", "AAV-1234");
        Boolean[] actual = {true, false, true, false};
        assertArrayEquals(expected, actual);
    }
}
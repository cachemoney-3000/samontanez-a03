package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputTest1() {
        Solution27 s = new Solution27();

        boolean expected = true;
        boolean actual = s.validateInputTest("Joshua", "Samontanez", "00000", "AA-1234");

        assertEquals(expected, actual);
    }


}
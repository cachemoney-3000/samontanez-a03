package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void rateCalc() {
        Solution31 s = new Solution31();
        //age: 21, restingHR: 65, intensity: 55
        double expected = (((220 - 21) - 65) * (55/100.0)) + 65;
        double[] actual = s.rateCalc(21,65);

        int expectedCalc = (int)expected;
        int actualCalc = (int)actual[55];
        assertEquals(expectedCalc, actualCalc);
    }

    @Test
    void rateCalc1() {
        Solution31 s = new Solution31();
        //age: 5, restingHR: 55, intensity: 70
        double expected = (((220 - 5) - 55) * (70/100.0)) + 55;
        double[] actual = s.rateCalc(5,55);

        int expectedCalc = (int)expected;
        int actualCalc = (int)actual[70];
        assertEquals(expectedCalc, actualCalc);
    }

    @Test
    void rateCalc2() {
        Solution31 s = new Solution31();
        //age: 70, restingHR: 95, intensity: 70
        double expected = (((220 - 70) - 95) * (70/100.0)) + 95;
        double[] actual = s.rateCalc(70,95);

        int expectedCalc = (int)expected;
        int actualCalc = (int)actual[70];
        assertEquals(expectedCalc, actualCalc);
    }
}
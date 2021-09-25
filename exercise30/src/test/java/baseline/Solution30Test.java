package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void multiplicationTable() {
        test sol30 = new test();
        int actual = sol30.multiplicationTableTest(1,2);
        assertEquals(2,actual);
    }

    @Test
    void multiplicationTable2() {
        test sol30 = new test();
        int actual = sol30.multiplicationTableTest(11,12);
        assertEquals(132,actual);
    }

    @Test
    void multiplicationTable3() {
        test sol30 = new test();
        int actual = sol30.multiplicationTableTest(8,9);
        assertEquals(72,actual);
    }
}
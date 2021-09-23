package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {
    @Test
    void calculateMonthsUntilPaidOff1(){
        PaymentCalculator p = new PaymentCalculator();

        int expected = 70;
        int actual = (int)Math.ceil(p.calculateMonthsUntilPaidOff(12, 5000, 100));

        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff2(){
        PaymentCalculator p = new PaymentCalculator();

        int expected = 63;
        int actual = (int)Math.ceil(p.calculateMonthsUntilPaidOff(4, 17000, 300));

        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff3(){
        PaymentCalculator p = new PaymentCalculator();

        int expected = 130;
        int actual = (int)Math.ceil(p.calculateMonthsUntilPaidOff(5, 20000, 200));

        assertEquals(expected, actual);
    }


}
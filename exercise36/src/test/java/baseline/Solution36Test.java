package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;

class Solution36Test {

    @Test
    void min() {
        Solution36 s = new Solution36();
        ArrayList<Integer> test = new ArrayList<>();
        Collections.addAll(test, 100,200,1000,300);
        int expected = 100;
        int actual = s.min(test);

        assertEquals(expected,actual);
    }

    @Test
    void max() {
        Solution36 s = new Solution36();
        ArrayList<Integer> test = new ArrayList<>();
        Collections.addAll(test, 100,200,1000,300);
        int expected = 1000;
        int actual = s.max(test);

        assertEquals(expected,actual);
    }

    @Test
    void average() {
        Solution36 s = new Solution36();
        ArrayList<Integer> test = new ArrayList<>();
        Collections.addAll(test, 100,200,1000,300);
        double expected = 400.0;
        double actual = s.average(test);

        assertEquals(expected,actual,0.0001);
    }

    @Test
    void std() {
        Solution36 s = new Solution36();
        ArrayList<Integer> test = new ArrayList<>();
        Collections.addAll(test, 100,200,1000,300);
        double expected = 353.55;
        double actual = s.std(test);

        assertEquals(expected,actual, 0.0001);
    }
}
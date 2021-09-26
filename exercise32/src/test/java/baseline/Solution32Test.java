package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void key() {
        //testing values for level 1, must be between 1-10
        Solution32 s = new Solution32();
        boolean actual;
        int value = s.key(1);

        if(value >= 1 && value <= 10) {
            actual = true;
        }
        else {
            actual = false;
        }

        assertEquals(true, actual);

    }

    @Test
    void key2() {
        //testing values for level 1, must be between 1-100
        Solution32 s = new Solution32();
        boolean actual;
        int value = s.key(2);

        if(value >= 1 && value <= 100) {
            actual = true;
        }
        else {
            actual = false;
        }

        assertEquals(true, actual);

    }

    @Test
    void key3() {
        //testing values for level 3, must be between 1-1000
        Solution32 s = new Solution32();
        boolean actual;
        int value = s.key(3);

        if(value >= 1 && value <= 10) {
            actual = true;
        }
        else {
            actual = false;
        }

        assertEquals(false, actual);

    }


}
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram1(){
        Solution24 sol = new Solution24();

        boolean expected = true;
        boolean actual = sol.isAnagram("note", "tone");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram2(){
        Solution24 sol = new Solution24();

        boolean expected = false;
        boolean actual = sol.isAnagram("DOG", "cat");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram3(){
        Solution24 sol = new Solution24();

        boolean expected = true;
        boolean actual = sol.isAnagram("NoTe", "TONE");

        assertEquals(expected, actual);
    }



}
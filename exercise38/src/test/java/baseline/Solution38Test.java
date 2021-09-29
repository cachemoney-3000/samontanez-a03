package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbers1() {
        String numbers = "1 2 3 4 5 6 7 8";
        Integer[] actual = Solution38.filterEvenNumbers(numbers);
        Integer[] expected = {2, 4, 6 ,8};

        assertArrayEquals(expected,actual);

    }

    @Test
    void filterEvenNumbers2() {
        String numbers = "1 3 5 9 7 11 13 55 99";
        Integer[] actual = Solution38.filterEvenNumbers(numbers);
        Integer[] expected = {};

        assertArrayEquals(expected,actual);

    }

    @Test
    void filterEvenNumbers3() {
        String numbers = "111112 555552 666663 111118 44441";
        Integer[] actual = Solution38.filterEvenNumbers(numbers);
        Integer[] expected = {111112, 555552, 111118};

        assertArrayEquals(expected,actual);

    }
}
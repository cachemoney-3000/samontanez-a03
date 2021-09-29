package baseline;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution28Test {

    @Test
    void test1() {
        Solution28 sol28 = new Solution28();

        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, sol28.sum(numbers));
    }

    @Test
    void test2() {
        Solution28 sol28 = new Solution28();

        int[] numbers = {1, 1, 1, 1, 1};
        assertEquals(5, sol28.sum(numbers));
    }

    @Test
    void test3() {
        Solution28 sol28 = new Solution28();

        int[] numbers = {1, -2, 3, -4, 5};
        assertEquals(3, sol28.sum(numbers));
    }
}
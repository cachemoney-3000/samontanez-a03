package baseline;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution28Test {

    @Test
    void main() {
        Solution28 sol28 = new Solution28();
        int expected  = 15;
        int actual = sol28.solve();
        Assert.assertEquals("15", actual);

    }
}
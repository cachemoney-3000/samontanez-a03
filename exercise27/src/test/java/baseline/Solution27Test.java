package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputTest1() {
        Solution27Testing s = new Solution27Testing();

        boolean expectedFirstName = true;
        boolean actualFirstName = s.firstNameTest("Joshua");
        assertEquals(expectedFirstName, actualFirstName);

        boolean expectedLastName = true;
        boolean actualLastName = s.lastNameTest("Samontanez");
        assertEquals(expectedLastName, actualLastName);

        boolean expectedZIP = true;
        boolean actualZIP = s.ZIPTest("55555");
        assertEquals(expectedZIP, actualZIP);

        boolean expectedID = true;
        boolean actualID = s.firstNameTest("AA-1234");
        assertEquals(expectedID, actualID);
    }

    @Test
    void validateInputTest2() {
        Solution27Testing s = new Solution27Testing();

        boolean expectedFirstName = false;
        boolean actualFirstName = s.firstNameTest("x");
        assertEquals(expectedFirstName, actualFirstName);

        boolean expectedLastName = true;
        boolean actualLastName = s.lastNameTest("gradle");
        assertEquals(expectedLastName, actualLastName);

        boolean expectedZIP = false;
        boolean actualZIP = s.ZIPTest("ABCDE");
        assertEquals(expectedZIP, actualZIP);

        boolean expectedID = false;
        boolean actualID = s.IDTest("AAB-12345");
        assertEquals(expectedID, actualID);
    }
}
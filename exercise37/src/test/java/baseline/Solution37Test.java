package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void generatePass() {
        //test how many letters will be generated using these parameters:
        int passwordSize = 9;
        int numSpecialChar = 3;
        int numNumbers = 2;
        int actualNumLetters = 0;
        int expectedNumLetters = 5; //add 1 since minimum is 9 characters
        Solution37 s = new Solution37();

        String password = s.generatePass(passwordSize,numSpecialChar,numNumbers);

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i)))
                actualNumLetters++;
        }

        assertEquals(expectedNumLetters,actualNumLetters);
    }

    @Test
    void generatePass1() {
        //test how many letters will be generated using these parameters:
        int passwordSize = 20;
        int numSpecialChar = 10;
        int numNumbers = 5;
        int actualNumLetters = 0;
        int expectedNumLetters = 6; //add 1 since minimum is 9 characters
        Solution37 s = new Solution37();

        String password = s.generatePass(passwordSize,numSpecialChar,numNumbers);

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i)))
                actualNumLetters++;
        }

        assertEquals(expectedNumLetters,actualNumLetters);
    }

    @Test
    void generatePass2() {
        //test how many letters will be generated using these parameters:
        int passwordSize = 1;
        int numSpecialChar = 3;
        int numNumbers = 2;
        int actualNumLetters = 0;
        int expectedNumLetters = 0; //no more space in the passwordSize
        Solution37 s = new Solution37();

        String password = s.generatePass(passwordSize,numSpecialChar,numNumbers);

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i)))
                actualNumLetters++;
        }

        assertEquals(expectedNumLetters,actualNumLetters);
    }
}
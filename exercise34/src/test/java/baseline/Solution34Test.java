package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void indexToRemove1() {
        Solution34 s = new Solution34();
        String expected = "Kanye West\n" +
                "Chancellor Bennet\n" +
                "Rakim Mayers\n" +
                "Tyler Gregory Okonma\n" +
                "Jacques Bermon Webster II\n" +
                "Aubrey Drake Graham\n";

        int index = s.removeEmployeeIndex("Frank Ocean");
        //converts the input string to a number
        String actual = s.indexToRemove(index);
        assertEquals(expected,actual);
    }

    @Test
    void indexToRemove2() {
        Solution34 s = new Solution34();
        String expected = "Kanye West\n" +
                "Chancellor Bennet\n" +
                "Rakim Mayers\n" +
                "Tyler Gregory Okonma\n" +
                "Frank Ocean\n" +
                "Aubrey Drake Graham\n";

        int index = s.removeEmployeeIndex("Jacques Bermon Webster II");
        //converts the input string to a number
        String actual = s.indexToRemove(index);
        assertEquals(expected,actual);
    }

    @Test
    void indexToRemove3() {
        Solution34 s = new Solution34();
        String expected = "Kanye West\n" +
                "Chancellor Bennet\n" +
                "Tyler Gregory Okonma\n" +
                "Frank Ocean\n" +
                "Jacques Bermon Webster II\n" +
                "Aubrey Drake Graham\n";

        int index = s.removeEmployeeIndex("Rakim Mayers");
        //converts the input string to a number
        String actual = s.indexToRemove(index);
        assertEquals(expected,actual);
    }
}
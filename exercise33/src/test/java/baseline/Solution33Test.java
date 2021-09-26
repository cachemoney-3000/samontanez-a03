package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void answer() {
        Solution33 s = new Solution33();
        boolean responseBool;
        String response = s.answer();

        if(response.equals("Yaaaaaass") || response.equals("Hell nah!") ||
                response.equals("Sheesh! Who knows") || response.equals("Ask again later") ||
                response.equals("Yeeet")) {
            responseBool = true;
        }
        else
            responseBool = false;

        assertEquals(true, responseBool);
    }
}
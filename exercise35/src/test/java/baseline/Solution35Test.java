package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    //the winner string must not be empty
    @Test
    void winner1() {
        Solution35 s = new Solution35();
        s.addContestant("Snoopy");
        s.addContestant("Clifford");
        s.addContestant("Dogg");
        String winner = s.winner();
        assertTrue(!winner.isEmpty());
    }
    @Test
    void winner2() {
        Solution35 s = new Solution35();
        s.addContestant("Snoopy");
        s.addContestant("Clifford");
        s.addContestant("Dogg");
        s.addContestant("Pewdiepie");
        s.addContestant("T-series");
        String winner = s.winner();
        assertTrue(!winner.isEmpty());
    }
    @Test
    void winner3() {
        Solution35 s = new Solution35();
        s.addContestant("Snoopy");
        s.addContestant("Clifford");
        s.addContestant("Dogg");
        s.addContestant("Kanye");
        s.addContestant("Drake");
        s.addContestant("Bush");
        s.addContestant("Tyler");
        s.addContestant("Karen");
        s.addContestant("Nike");
        s.addContestant("Adidas");
        String winner = s.winner();
        assertTrue(!winner.isEmpty());
    }
}
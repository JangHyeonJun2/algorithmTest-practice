package test.java;

import main.java.bornroast.Change;
import main.java.bornroast.Nqueen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodingTest {

    @Test
    void nQueenTest() {
        Nqueen nqueen = new Nqueen();
        int answer = nqueen.solution(4);
        Assertions.assertEquals(2, answer);
    }

    @Test
    void changTest() {
        Change change = new Change();
        int answer = change.solution(5, new int[]{1,2,5});
        Assertions.assertEquals(4, answer);
    }
}
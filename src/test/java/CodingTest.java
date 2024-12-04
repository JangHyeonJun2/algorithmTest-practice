package test.java;

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
}
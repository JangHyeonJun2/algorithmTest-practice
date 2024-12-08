package test.java;

import main.java.bornroast.*;
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

    @Test
    void findMostBigSquareTest() {
        FindMostBigSquare fmbs = new FindMostBigSquare();
        int answer = fmbs.solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}});
        Assertions.assertEquals(9, answer);

        int answer2 = fmbs.solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}});
        Assertions.assertEquals(4, answer2);
    }

    @Test
    void findMostLongFalindRoomTest() {
        FindMostLongFalindRoom findMostLongFalindRoom = new FindMostLongFalindRoom();
        int answer = findMostLongFalindRoom.solution("abcdcba");
        Assertions.assertEquals(7, answer);


        int answer2 = findMostLongFalindRoom.solution("abacde");
        Assertions.assertEquals(3, answer2);
    }

    @Test
    void tileTest() {
        Tile tile = new Tile();
        int answer = tile.solution(4);
        Assertions.assertEquals(5, answer);
    }
}
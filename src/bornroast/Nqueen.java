package bornroast;
/*
 * 문제 URL: https://school.programmers.co.kr/learn/courses/30/lessons/12952?language=java
 */
public class Nqueen {
    public int solution(int n) {
        return countNQueens(new int[n], 0);
    }

    private int countNQueens(int[] board, int row) {
        if (row == board.length) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isValidPlacement(board, row, col)) {
                board[row] = col;

                count += countNQueens(board, row + 1);
            }
        }

        return count;
    }

    private boolean isValidPlacement(int[] board, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = board[prevRow];

            if (prevCol == col) {
                return false;
            }

            if (Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
                return false;
            }
        }

        return true;
    }
}

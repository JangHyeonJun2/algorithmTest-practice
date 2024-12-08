package main.java.bornroast;

public class FindMostBigSquare {
    public int solution(int[][] board) {
        int boardLength = board[0].length;
        int maxSize = 0;

        int[] dp = new int[boardLength + 1];

        for (int[] row : board) {
            int prev = 0;
            for (int j = 1; j <= boardLength; j++) {
                int temp = dp[j];
                if (row[j-1] == 1) {
                    dp[j] = Math.min(dp[j], Math.min(dp[j-1], prev)) + 1;
                    maxSize = Math.max(maxSize, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }

        return maxSize * maxSize;
    }
}

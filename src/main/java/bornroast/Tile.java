package main.java.bornroast;

/*
 * 문제URL: https://school.programmers.co.kr/learn/courses/30/lessons/12900
 */
public class Tile {
    public int solution(int n) {
        final int MOD = 1_000_000_007;

        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }

        return dp[n];
    }
}

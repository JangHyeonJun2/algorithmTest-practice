package main.java.bornroast;
/*
 * 문제 URL: https://school.programmers.co.kr/learn/courses/30/lessons/12907?language=java
 */
public class Change {
    public int solution(int n, int[] money) {
        int MOD = 1_000_000_007;

        int[] answer = new int[n + 1];

        // 0원을 만드는 방법은 1가지임.
        answer[0] = 1;

        for (int m : money) {
            for (int amount = m; amount <= n; amount++) {
                answer[amount] = (answer[amount] + answer[amount - m]) % MOD;
            }
        }

        return answer[n];
    }
}

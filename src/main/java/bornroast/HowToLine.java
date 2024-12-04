package main.java.bornroast;

import java.util.ArrayList;
import java.util.List;

/*
 * 다른 사람 코드 풀이 참고함.. 다시 이해하기
 */
class HowToLine {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        k--;

        for (int i = 0; i < n; i++) {
            int index = (int) (k / factorial[n - 1 - i]);
            answer[i] = numbers.get(index);
            numbers.remove(index);
            k %= factorial[n - 1 - i];
        }

        return answer;
    }
}

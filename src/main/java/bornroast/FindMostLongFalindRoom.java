package main.java.bornroast;

/*
 * 문제URL : https://school.programmers.co.kr/learn/courses/30/lessons/12904
 */
public class FindMostLongFalindRoom {
    public int solution(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = calLongFalind(s, i, i);
            int len2 = calLongFalind(s, i, i + 1);

            maxLength = Math.max(maxLength, Math.max(len1, len2));
        }

        return maxLength;
    }

    private int calLongFalind(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

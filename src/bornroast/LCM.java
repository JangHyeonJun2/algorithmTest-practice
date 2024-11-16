package bornroast;

import java.util.Arrays;

public class LCM {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int solution(int[] arr) {
        return Arrays.stream(arr).reduce(1, LCM::lcm);
    }
}

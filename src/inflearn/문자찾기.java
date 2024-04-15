package inflearn;

import java.util.Scanner;

public class 문자찾기 {
    public static int solution(String str, char s) {
        int answer = 0;
        // 대문자로 변경
        String upperCase = str.toUpperCase();
        char charUpperCase = Character.toUpperCase(s);

        for (char x : upperCase.toCharArray()) {
            if ( charUpperCase == x ) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));
    }
}

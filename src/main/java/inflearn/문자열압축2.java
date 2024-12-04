package main.java.inflearn;

import java.util.Scanner;

public class 문자열압축2 {
    public static void solution(String str) {
        StringBuilder answer = new StringBuilder();
        str+=" "; // i == i+1 를 계산하기 위해 마지막 문자를 공백으로 추가
        int score = 1;
        for (int i=0; i<str.length() - 1; i++) { // -1을 해야하는 이유는 위에서 공백문자를 추가했기 때문에 -1을 해야 원래 문자열까지만 계산한다.
            if (str.charAt(i) == str.charAt(i+1)) {
                score++;
            } else {
                answer.append(str.charAt(i));
                if (score > 1) {
                    answer.append(score);
                    score = 1;
                }
            }
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next());
    }
}

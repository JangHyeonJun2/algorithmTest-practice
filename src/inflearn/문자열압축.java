package inflearn;

import java.util.Scanner;

public class 문자열압축 {
    public static void solution(String str) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        int score = 0;

        String firstAlphabet = str.substring(0,1);

        for (String alphabet : str.split("")) {
            if (firstAlphabet.equals(alphabet)) {
                score++;
            } else {
                if (score == 1) {
                    answer.append(firstAlphabet);
                } else {
                    answer.append(firstAlphabet).append(score);
                }

                firstAlphabet = alphabet;
                score = 1;
            }
            idx++;
            if (idx == str.length()) {
                if (score == 1) {
                    answer.append(firstAlphabet);
                } else {
                    answer.append(firstAlphabet).append(score);
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

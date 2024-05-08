package inflearn;

import java.util.Scanner;
/*
 * 설명: 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하여라
 * 입력: 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다. 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 출력: 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */
public class 대소문자변환 {
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String solution = solution(next);
        System.out.println(solution);
    }
}

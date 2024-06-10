package inflearn;

import java.util.Scanner;

/*
 * 설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고한다.
 *      문자열이 입력되면 해당 문자열이 팰린드롬이면 'YES', 아니면 'NO'를 출력하는 프로그램을 작성하시오.
 *      단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자을 구분하지 않는다. ( 알파벳 이외의 문자들을 무시한다. )
 * 입력: 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 출력: 첫 번쨰 줄에 팰린드롬인지의 결과를 'YES' OR 'NO'로 출력한다.
 */
public class 유효한팰리드롬 {
    public static void solution(String str) {
        StringBuilder updatedStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                updatedStr.append(ch);
            }
        }

        if (updatedStr.toString().compareToIgnoreCase(updatedStr.reverse().toString()) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextLine());
    }
}

package main.java.inflearn;

import java.util.Scanner;

/*
 * 설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
 *      문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하여라
 *      단, 회문을 검사할 때 대소문자를 구분하지 않는다.
 * 입력: 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어진다.
 * 출력: 첫 번쨰 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력한다.
 * 풀이: 길이 절반만큼 반복문 돌리기
 */
public class 회전문자열_2 {
    public static void solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i=0; i<len/2; i++) {
            if ( str.charAt(i) != str.charAt(len -i -1)) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next());
    }
}

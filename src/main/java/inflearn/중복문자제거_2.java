package main.java.inflearn;

import java.util.Scanner;

/*
 * 설명: 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요. 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지한다.
 * 입력: 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 줄에 중복문자가 제거된 문자열을 출력한다.
 * 풀이: indexOf 함수 사용
 */
public class 중복문자제거_2 {
    public static void solution(String str) {
        String answer = "";
        for (int i=0; i<str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next());
    }
}

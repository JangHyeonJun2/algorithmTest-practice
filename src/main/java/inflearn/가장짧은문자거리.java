package main.java.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 설명: 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 입력: 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어진다.
 *      문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class 가장짧은문자거리 {
    public static void solution(String str, String ch) {
        List<Integer> indexPosition = new ArrayList<>();
        StringBuilder answer = new StringBuilder();

        String[] strings = str.split("");

        for (int i=0; i<str.length(); i++) {
            if ( strings[i].equals(ch) ) {
                indexPosition.add(i);
            }
        }

        for (int i=0; i<str.length(); i++) {
            int minValue = Integer.MAX_VALUE;
            for (int idx : indexPosition) {
                if ( (idx - i) < minValue ) {
                    minValue = Math.abs(idx - i);
                }
            }
            answer.append(minValue).append(" ");
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next(), sc.next());
    }
}

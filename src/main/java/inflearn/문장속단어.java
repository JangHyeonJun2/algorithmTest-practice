package main.java.inflearn;

import java.util.Scanner;

/*
 * 설명: 한 개의 문장이 주어지면 그 문장속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분된다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어있다.
 * 출력: 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
 */
public class 문장속단어 {
    public static String solution(String str) {
        String answer = "";
        String[] strings = str.split(" ");
        for (String s : strings) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String solution = solution(next);
        System.out.println("solution = " + solution);
    }
}

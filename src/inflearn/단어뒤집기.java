package inflearn;

/*
 * 설명: N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 출력: N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */

import java.util.Scanner;

public class 단어뒤집기 {
    public static void solution(String[] strings) {
        StringBuilder sb;

        for (String s : strings) {
            sb = new StringBuilder();
            System.out.println(sb.append(s).reverse());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 3 || 20 < n) {
            return;
        }

        String[] strings = new String[n];

        for (int i=0; i<n; i++) {
            strings[i] = sc.next();
        }

        solution(strings);
    }
}

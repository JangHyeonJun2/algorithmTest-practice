package main.java.inflearn;

import java.util.Scanner;

public class 암호2 {
    public static void solution(int num, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<num; i++) {
            answer.append((char)Integer.parseInt(str.substring(0, 7).replace('#', '1').replace('*', '0'), 2));
            str = str.substring(7);
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), sc.next());
    }
}

package main.java.inflearn.수열;

import java.util.Scanner;

public class 피보나치수열 {
    public int[] solution(int num) {
        int[] answer = new int[num];
        int first = 1;
        int second = 1;

        answer[0] = first;
        answer[1] = second;

        for (int i=2; i<num; i++) {
            answer[i] = first + second;
            first = second;
            second = answer[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        피보나치수열 main = new 피보나치수열();
        int[] solution = main.solution(sc.nextInt());
        for (int n : solution) {
            System.out.print(n);
            System.out.print(" ");
        }
    }
}

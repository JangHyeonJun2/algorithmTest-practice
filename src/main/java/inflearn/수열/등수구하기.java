package main.java.inflearn.수열;

import java.util.Scanner;

/*
 * 설명: N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성해라
 *      같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉, 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * 입력: 첫 줄에 N ( 3<=N<=100 )이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * 출력: 입력된 순서대로 등수를 출력한다.
 */
public class 등수구하기 {
    public void solution(int[] koreaScores) {
        int[] answer = new int[koreaScores.length];

        for (int i=0; i< koreaScores.length; i++) {
            int grade = 1;
            int koreaScore = koreaScores[i];

            for (int score : koreaScores) {
                if (koreaScore < score) {
                    grade++;
                }
            }
            answer[i] = grade;

        }

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[] koreaScores = new int[students];

        for (int i=0; i<students; i++) {
            koreaScores[i] = sc.nextInt();
        }
        등수구하기 answer = new 등수구하기();
        answer.solution(koreaScores);
    }
}

package main.java.inflearn.수열;

import java.util.Scanner;

public class 보이는학생 {
    public int solution(int[] arr) {
        int answer = 0;
        int standardStudent = Integer.MIN_VALUE;

        for (int studentHeight : arr) {
            if (standardStudent < studentHeight) {
                answer++;
                standardStudent = studentHeight;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sn = sc.nextInt();
        int[] arr = new int[sn];
        for (int i=0; i<sn; i++) {
            arr[i] = sc.nextInt();
        }

        보이는학생 main = new 보이는학생();
        int solution = main.solution(arr);
        System.out.println(solution);
    }
}

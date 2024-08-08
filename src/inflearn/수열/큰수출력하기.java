package inflearn.수열;

import java.util.Scanner;

public class 큰수출력하기 {
    public void solution(int num, int[] arr) {
        StringBuilder answer = new StringBuilder();
        int tmp = 0;
        int frontValue = Integer.MIN_VALUE;

        for (int i=0; i<num; i++) {
            if (frontValue < arr[i]) {
                answer.append(arr[i]).append(" ");
            }
            frontValue = arr[i];
        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        큰수출력하기 T = new 큰수출력하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        T.solution(n, arr);
    }
}

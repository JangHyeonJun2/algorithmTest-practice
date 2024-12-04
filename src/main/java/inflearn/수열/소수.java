package main.java.inflearn.수열;

import java.util.Scanner;
/*
 * 설명: 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요. 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개입니다.
 * 입력: 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 출력: 첫 줄에 소수의 개수를 출력한다.
 */
public class 소수 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];  //0부터 n까지의 수이기 때문에 n+1을 할당한다.

        for (int i=2; i<=n; i++) { // 0과1은 소수로 취급 x
            if (ch[i] == 0) { //소수이면
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        소수 main = new 소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}

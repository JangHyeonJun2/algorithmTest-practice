package inflearn.수열;

import java.util.Scanner;
/*
 * 설명: N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 입력: 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 각 자연수의 크기는 100,000를 넘지 않는다.
 * 출력: 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
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

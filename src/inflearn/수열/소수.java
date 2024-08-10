package inflearn.수열;

import java.util.Scanner;

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

package inflearn.수열;

import java.util.Scanner;

public class 가위바위보 {
//    private final int gayi = 1;
//    private final int bayi = 2;
//    private final int bo   = 3;
    public String[] solution(int num, int[] a, int[] b) {
        String[] answer = new String[num];
        for (int i=0; i<num; i++) {
            int aResult = a[i];
            int bResult = b[i];
            answer[i] = getWinnerGame(aResult, bResult);
        }
        return answer;
    }

    public String getWinnerGame(int a, int b) {
        if ( (a == 1 && b == 2) || (a == 3 && b == 1) || (a == 2 && b == 3)) {
            return "B";
        } else if (a == b) {
            return "D";
        }
        return "A";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] a = new int[num];
        for (int i=0; i<num; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[num];
        for (int i=0; i<num; i++) {
            b[i] = sc.nextInt();
        }

        가위바위보 main = new 가위바위보();
        String[] solution = main.solution(num, a, b);

        for (String s : solution) {
            System.out.println(s);
        }
    }
}

package inflearn;

import java.util.Scanner;

public class 암호 {
    public static void solution(int num, String str) {
        StringBuilder answer = new StringBuilder();
        int lt = 0;
        int rt = 7;
        for (int i=1; i<=num; i++) {
            StringBuilder bn = new StringBuilder();
            String substring = str.substring(lt, rt);
            for (char ch : substring.toCharArray()) {
                if (ch == '#') {
                    bn.append('1');
                }

                if (ch == '*') {
                    bn.append('0');
                }
            }
            int decimal = Integer.parseInt(bn.toString(), 2);
            answer.append((char) decimal);
            lt = rt;
            rt = 7*(i+1);
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), sc.next());
    }
}

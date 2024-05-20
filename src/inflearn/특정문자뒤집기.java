package inflearn;

import java.util.Scanner;

/*
 * 설명: 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어진다.
 * 출력: 첫 줄에 알파벳만 뒤집힌 문자열을 출력한다.
 */
public class 특정문자뒤집기 {
    public static void solution(String str) {

        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if ( !Character.isAlphabetic(charArray[lt]) ) {
                lt++;
            } else if ( !Character.isAlphabetic(charArray[rt]) ) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

//        for (int i=0; i<charArray.length; i++) {
//            answer += charArray[i];
//        }
        System.out.println(String.valueOf(charArray));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.next());
    }
}

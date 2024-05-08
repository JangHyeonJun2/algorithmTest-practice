package inflearn;

import java.util.Scanner;

/*
 * 설명: 한 개의 문장이 주어지면 그 문장속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분된다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어있다.
 * 출력: 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
 */
public class 문장속단어_2 {
    public static String solution(String str) {
        String answer = "";
        int len = Integer.MIN_VALUE;
        int pos;

        while ( (pos = str.indexOf(' ')) != -1) { // 공백을 발견하면 index return, 만약 발견하지 못하면 -1 return
            String tmpStr = str.substring(0, pos);
            if ( len < tmpStr.length() ) {
                len = tmpStr.length();
                answer = tmpStr;
            }

            str = str.substring(pos + 1);
        }

        if (str.length() > len) { // 마지막 study 단어만 남으면, 공백을 찾을 수 없어서 while문을 탈수없음. 그래서 해당 로직이 필요함.
            answer = str;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String solution = solution(next);
        System.out.println("solution = " + solution);
    }
}

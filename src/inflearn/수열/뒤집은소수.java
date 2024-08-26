package inflearn.수열;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int n : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            int reverseNumber = Integer.parseInt(sb.reverse().toString());

            if (isPrime(reverseNumber)) {
                integerArrayList.add(reverseNumber);
            }
        }
        return integerArrayList.stream().mapToInt( Integer::intValue ).toArray();
    }

    public Boolean isPrime(int num) {
        boolean isPrime = num != 1;

        for (int i=2; i<= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        뒤집은소수 main = new 뒤집은소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] solution = main.solution(arr);

        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}

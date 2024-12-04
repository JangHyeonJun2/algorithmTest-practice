package main.java.algorithmTest_20240101;

import java.util.HashMap;
import java.util.Map;

public class Pccp {
    public int solution(int[] bandage, int health, int[][] attacks) {

        Map<Integer, Integer> attackInfo = new HashMap<>();
        int endTime = 0;
        int curHealth = health;
        int successStreak = 0;

        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
            endTime = attack[0];
        }

        for (int i = 1; i <= endTime; i++) {
            if (attackInfo.containsKey(i)) { // 공격이 있다면
                curHealth -= attackInfo.get(i);
                successStreak = 0;
            } else {
                curHealth += bandage[1];
                successStreak++; // 연속 체력 성공 카운트 증감

                if (successStreak == bandage[0]) {
                    curHealth += bandage[2];
                    successStreak = 0;
                }
                if (curHealth > health) {
                    curHealth = health;
                }
            }

            if (curHealth <= 0) { // 이번 턴을 마치고 체력이 바닥났다면 종료
                return -1;
            }
        }

        return curHealth;
    }

//    public static void main(String[] args) {
//        Pccp pccp = new Pccp();
//        int[] bandage = {5, 1, 5};
//        int health = 30;
//        int[][] attacks = {{2,10}, {9,15}, {10,5}, {11,5}};
//
//        int solution = pccp.solution(bandage, health, attacks);
//        System.out.println(solution);
//    }

    public static void main(String[] args) {
        Pccp pccp = new Pccp();
        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks = {{1,15}, {5,16}, {8,6}};

        int solution = pccp.solution(bandage, health, attacks);
        System.out.println(solution);
    }
}

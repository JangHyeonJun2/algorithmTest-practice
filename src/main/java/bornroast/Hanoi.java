package main.java.bornroast;

import java.util.ArrayList;
import java.util.List;

class Hanoi {
    public int[][] solution(int n) {
        List<int[]> moves = new ArrayList<>();
        moveHanoi(n, 1, 3, 2, moves);

        int[][] answer = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            answer[i] = moves.get(i);
        }
        return answer;
    }

    // pillar: 기둥
    private void moveHanoi(int n, int from, int to, int pill, List<int[]> moves) {
        if (n == 1) {
            moves.add(new int[]{from, to});
            return;
        }
        moveHanoi(n - 1, from, pill, to, moves);
        moves.add(new int[]{from, to});
        moveHanoi(n - 1, pill, to, from, moves);
    }
}

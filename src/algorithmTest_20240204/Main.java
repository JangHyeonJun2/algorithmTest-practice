package algorithmTest_20240204;
/*
 * 프로그래머스 PCCE 기출문제 9번 (이웃한칸) lv1
 */
public class Main {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int boardLength = board.length;
        int[] dh = new int[]{0, 1, -1, 0};
        int[] dw = new int[]{1, 0, 0, -1};

        for (int i=0; i<=3; i++) {
            int hCheck = h + dh[i];
            int wCheck = w + dw[i];

            if ( (hCheck >= 0 && hCheck < boardLength) && (wCheck >= 0 && wCheck < boardLength)) {
                if (board[h][w].equals(board[hCheck][wCheck])) {
                    answer+=1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
//        int solution = main.solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1);
        int solution = main.solution(new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1);
        System.out.println(solution);
    }
}

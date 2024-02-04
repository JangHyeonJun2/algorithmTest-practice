package algorithmTest_20240204;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 프로그래머스 리코챗 로봇 (lv2)
 */
public class RecoChat {
    static int[] dx = new int[]{0, 1, -1, 0};
    static int[] dy = new int[]{1, 0, 0, -1};
    static int gameH;
    static int gameW;
    static char[][] gameMap;

    public int solution(String[] board) {
        int answer = 0;
        gameH = board.length;
        gameW = board[0].length();

        boolean[][] visited = new boolean[gameH][gameW];

        Queue<Position> que = new LinkedList<>();

        gameMap = new char[gameH][gameW];

        //시작위치 표기하기
        for (int i=0; i<gameH; i++) {
            gameMap[i] = board[i].toCharArray();
            if (board[i].contains("R")) {
                que.add(new Position(i, board[i].indexOf("R"), 0));
                visited[i][board[i].indexOf("R")] = true;
            }
        }

        while (!que.isEmpty()) {
            Position current = que.poll();
            for (int i=0; i<=3; i++) { //좌우상하
                Position next = block(current, i);
                if (gameMap[next.x][next.y] == 'G') {
                    return next.cnt;
                } else if (!visited[next.x][next.y]) {
                    que.add(next);
                    visited[next.x][next.y] = true;
                }
            }
        }
        return -1; // 찾지못했을 때!
    }

    public Position block(Position position, int distance) {
        int px = position.x;
        int py = position.y;

        while (true) {
            px += dx[distance];
            py += dy[distance];

            if ( (px >= 0 && px < gameH) && (py >=0 && py < gameW)) {
                if (gameMap[px][py] == 'D')
                    break;
            } else
                break;
        }

        return new Position(px - dx[distance], py - dy[distance], position.cnt + 1);
    }
    public static void main(String[] args) {
        RecoChat recoChat = new RecoChat();
        //example 1
//        int solution = recoChat.solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."});

        //example 2
        int solution = recoChat.solution(new String[]{".D.R", "....", ".G..", "...D"});
        System.out.println(solution);
    }
}
class Position {
    int x;
    int y;
    int cnt;

    public Position(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
package bornroast;

import java.util.Objects;
import java.util.PriorityQueue;

/*
 * 문제 URL: https://school.programmers.co.kr/learn/courses/30/lessons/12920?language=java
 * 효율성 테스트 통과 안됌..
 */
public class Scheduling {
    public int solution(int n, int[] cores) {
        if (n <= cores.length) {
            return n;
        }

        n -= cores.length;

        PriorityQueue<Core> pq = new PriorityQueue<>((a, b) -> {
            if (a.time == b.time) return a.index - b.index;
            return a.time - b.time;
        });

        for (int i = 0; i < cores.length; i++) {
            pq.offer(new Core(i + 1, cores[i], cores[i]));
        }

        while (n > 0) {
            Core core = pq.poll();
            n--;
            if (n == 0) {
                return Objects.requireNonNull(core).index;
            }

            Objects.requireNonNull(core).time += core.core;
            pq.offer(core);
        }

        return -1;
    }
    private static class Core {
        int index;
        int core;
        int time;

        Core(int index, int core, int availableTime) {
            this.index = index;
            this.core = core;
            this.time = availableTime;
        }
    }
}

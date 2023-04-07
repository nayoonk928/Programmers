import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1] - 1;
            int find = commands[i][2];

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int j = startIdx; j <= endIdx; j++) {
                pq.offer(array[j]);
            }

            // find - 1 번째 까지 poll
            for (int k = 0; k < find - 1; k++) {
                pq.poll();
            }

            // find 번째 요소 poll하며 answer에 넣기
            answer[i] = pq.poll();
        }
        return answer;
    }
}

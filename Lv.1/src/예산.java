import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        int max = 0;
        for (int i = 0; i < d.length; i++) {
            max += d[i];

            if (max > budget) {
                break;
            }

            answer++;
        }

        return answer;
    }
}
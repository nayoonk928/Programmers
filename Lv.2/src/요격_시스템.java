import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;

        // 두 번째 열을 기준으로 오름차순 정렬
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);

        int end = targets[0][1];

        for(int[] target:targets){

            int tempStart = target[0];
            int tempEnd = target[1];

            if(end <= tempStart){

                end = tempEnd;
                answer++;
            }
        }

        return answer + 1;
    }
}
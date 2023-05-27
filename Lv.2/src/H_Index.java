import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int h = n; h >= 0; h--) {
            if (n - h >= 0 && citations[n - h] >= h) {
                return h;
            }
        }

        return 0;
    }
}
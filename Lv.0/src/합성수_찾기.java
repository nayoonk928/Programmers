import java.util.*;

class Solution {
    public int solution(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (getDivisor(i) >= 3) {
                cnt++;
            }
        }

        return cnt;
    }

    public int getDivisor(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= (int)n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        list.add(n);

        return list.size();
    }
}
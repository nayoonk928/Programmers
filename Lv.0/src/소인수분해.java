import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        if (n < 2 || n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
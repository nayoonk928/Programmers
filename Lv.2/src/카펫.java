import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer> divisors = getDivisors(yellow);

        int size = divisors.size();
        for (int i = 0; i < size; i++) {
            int width = divisors.get(i);
            int height = yellow / width;

            if (width * height == yellow && brown == 2 * (width + height) + 4) {
                answer[0] = Math.max(width, height) + 2;
                answer[1] = Math.min(width, height) + 2;
                break;
            }
        }
        return answer;
    }

    private ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }
}

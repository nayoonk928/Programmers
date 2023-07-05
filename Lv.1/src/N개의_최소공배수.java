class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int x, y, gcd = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                x = arr[i];
            } else {
                x = answer;
            }
            y = arr[i + 1];
            gcd = gcd(x, y, x % y);
            answer = (x * y) / gcd;
        }

        return answer;
    }

    private int gcd(int x, int y, int r) {
        while (x % y != 0) {
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }
}
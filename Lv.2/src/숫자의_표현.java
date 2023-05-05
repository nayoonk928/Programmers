class Solution {
    public int solution(int n) {
        return getOddGcd(n);
    }

    private int getOddGcd(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                continue;
            }

            int j = n / i;

            if (i % 2 != 0) {
                cnt++;
            }

            if (j != i && j % 2 != 0) {
                cnt++;
            }

        }

        return cnt;
    }
}
class Solution {
    public int solution(int n) {

        for (int i = 0; i < 10; i++) {
            int tmp = factorial(i);
            int tmp2 = factorial(i + 1);

            if (tmp <= n && tmp2 > n) {
                return i;
            }
        }

        return 10;
    }

    public int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
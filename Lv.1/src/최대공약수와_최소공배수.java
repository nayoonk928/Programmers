class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = lcm(answer[0], n, m);

        return answer;
    }

    private int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        }

        return gcd(m, n % m);
    }

    private int lcm(int gcd, int n, int m) {
        return (n * m) / gcd;
    }
}
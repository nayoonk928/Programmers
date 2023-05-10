class Solution {
    public int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int lcm = getLcm(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            lcm = getLcm(lcm, arr[i]);
        }
        return lcm;
    }

    private int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }

    private int getLcm(int a, int b) {
        return (a * b) / getGcd(a, b);
    }
}

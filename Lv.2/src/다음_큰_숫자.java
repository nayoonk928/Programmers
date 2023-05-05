class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);

        return findBiggerNum(count, n);
    }

    private int findBiggerNum(int count, int n) {
        while (true) {
            n++;
            int one = Integer.bitCount(n);

            if (one == count) {
                return n;
            }
        }
    }
}
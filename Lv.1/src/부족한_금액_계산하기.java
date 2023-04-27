class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0L;
        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }

        long change = (long) money - totalCost;
        return change < 0 ? change * -1 : 0;
    }
}
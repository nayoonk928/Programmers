class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];

        for (int i = 0; i < answer.length; i++) {
            if (i == n) {
                int last = num_list[n - 1];
                int prev = num_list[n - 2];
                if (last > prev) {
                    answer[i] = last - prev;
                } else {
                    answer[i] = last * 2;
                }
            } else {
                answer[i] = num_list[i];
            }
        }

        return answer;
    }
}
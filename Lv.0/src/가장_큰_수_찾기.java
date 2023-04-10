class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int cur = array[i];
            if (cur > max) {
                answer[0] = cur;
                answer[1] = i;
                max = cur;
            }
        }

        return answer;
    }
}
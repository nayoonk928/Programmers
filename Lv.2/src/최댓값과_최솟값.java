class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] strs = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String str : strs) {
            int n = Integer.parseInt(str);
            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }

        answer.append(min).append(" ").append(max);

        return answer.toString();
    }
}
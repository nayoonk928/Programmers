class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s);
        int n = overwrite_string.length();

        for (int i = 0; i < n; i++) {
            answer += overwrite_string.substring(i, i + 1);
        }

        answer += my_string.substring(s + n, my_string.length());

        return answer;
    }
}
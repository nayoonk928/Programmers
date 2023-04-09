class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                answer += (char)(c + 32);
            } else if (c >= 'a' && c <= 'z') {
                answer += (char)(c - 32);
            }
        }

        return answer;
    }
}
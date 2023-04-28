class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] chars = s.toCharArray();

        if (Character.isDigit(chars[0])) {
            answer.append(chars[0]);
        } else {
            answer.append(Character.toUpperCase(chars[0]));
        }

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == ' ') {
                answer.append(Character.toUpperCase(chars[i]));
            } else {
                answer.append(Character.toLowerCase(chars[i]));
            }
        }

        return answer.toString();
    }
}
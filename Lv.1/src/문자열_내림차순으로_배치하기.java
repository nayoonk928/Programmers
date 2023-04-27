import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // 역순으로 배열
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        for (char c : chars) {
            answer.append(c);
        }

        return answer.toString();
    }
}
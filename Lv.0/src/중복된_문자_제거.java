import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");

        for (int i = 0; i < str.length; i++) {
            if (!answer.contains(str[i])) {
                answer += str[i];
            }
        }

        return answer;
    }
}
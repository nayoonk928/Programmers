import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> stack = new Stack<>();
        int index = 2;
        int turn = 1;

        stack.push(words[0]);
        for (int i = 1; i < words.length; i++) {
            String prevWord = stack.peek();
            String curWord = words[i];

            if (prevWord.charAt(prevWord.length() - 1) != curWord.charAt(0) || stack.contains(curWord)) {
                answer[0] = index;
                answer[1] = turn;
                return answer;
            }

            stack.push(curWord);
            index = (index == n) ? 1 : index + 1;
            if (index == 1) {
                turn++;
            }
        }

        return answer;
    }
}

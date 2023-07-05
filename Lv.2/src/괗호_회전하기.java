import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();

        if (n % 2 == 1) {
            return 0;
        }

        char[] ch = s.toCharArray();

        List<Character> list = new ArrayList<>();
        for (char c : ch) {
            list.add(c);
        }

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();

            for (Character element : list) {
                if (!stack.isEmpty()) {
                    if (element == ')' && stack.peek() == '(') {
                        stack.pop();
                        continue;
                    } else if (element == '}' && stack.peek() == '{') {
                        stack.pop();
                        continue;
                    } else if (element == ']' && stack.peek() == '[') {
                        stack.pop();
                        continue;
                    }
                }

                stack.push(element);
            }

            if (stack.isEmpty()) {
                answer++;
            }

            list.add(list.remove(0));
        }

        return answer;
    }
}
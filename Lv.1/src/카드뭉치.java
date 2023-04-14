import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cd1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cd2 = new LinkedList<>(Arrays.asList(cards2));

        String c1 = cd1.peek();
        String c2 = cd2.peek();

        for (String g : goal) {
            if (g.equals(c1)) {
                cd1.poll();
                c1 = cd1.peek();
            } else if (g.equals(c2)) {
                cd2.poll();
                c2 = cd2.peek();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
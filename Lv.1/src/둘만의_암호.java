import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }

        List<Character> alphabetList = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!skipSet.contains(ch)) {
                alphabetList.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (skipSet.contains(ch)) {
                sb.append(ch);
            } else {
                char transformedCh = transformChar(ch, index, alphabetList);
                sb.append(transformedCh);
            }
        }

        return sb.toString();
    }

    public char transformChar(char ch, int index, List<Character> alphabetList) {
        int idx = alphabetList.indexOf(ch);
        idx = (idx + index) % alphabetList.size();
        return alphabetList.get(idx);
    }
}

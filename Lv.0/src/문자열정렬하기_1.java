import java.util.stream.*;

class Solution {
    public int[] solution(String my_string) {

        int[] answer = my_string.chars().filter(Character::isDigit).map(Character::getNumericValue).sorted().toArray();

        return answer;
    }
}
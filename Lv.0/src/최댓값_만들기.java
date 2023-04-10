import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int index = numbers.length - 1;
        int right = numbers[index] * numbers[index - 1];
        int left = numbers[0] * numbers[1];

        return right > left ? right : left;
    }
}
import java.util.ArrayList;
import java.util.Arrays;

class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.size() != 0) {
            answer = new int[list.size()];
            int size = 0;
            for (int num : list) {
                answer[size++] = num;
            }
            Arrays.sort(answer);
        } else if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
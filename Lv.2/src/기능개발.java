import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] day = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<>();

        // 각각의 작업 일수 계산
        for (int i = 0; i < progresses.length; i++) {
            day[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                day[i]++;
            }
            queue.add(day[i]);
        }

        int count = 0;
        int first = queue.peek();

        while (!queue.isEmpty()) {
            if (queue.peek() <= first) { // 큐의 front 부분과 비교
                queue.poll();
                count++;
            } else { // front 부분보다 크다면 새로운 first로 지정
                list.add(count);
                count = 1;
                first = queue.poll();
            }
        }
        list.add(count); // 마지막 카운트 저장

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
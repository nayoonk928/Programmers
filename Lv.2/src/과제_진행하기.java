import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    private PriorityQueue<Assignment> queue;
    private Stack<Assignment> stop;
    private Stack<Assignment> ing;

    public String[] solution(String[][] plans) {
        int len = plans.length;
        String[] answer = new String[len];

        queue = new PriorityQueue<>();
        stop = new Stack<>();
        ing = new Stack<>();

        for (String[] plan : plans) {
            queue.offer(new Assignment(plan));
        }

        LocalTime curTime = queue.peek().startTime;
        ing.push(queue.poll());

        int index = 0;
        while (!queue.isEmpty() || !stop.isEmpty() || !ing.isEmpty()) {
            while (!queue.isEmpty() && queue.peek().startTime.compareTo(curTime) <= 0) {
                if (ing.isEmpty()) {
                    ing.push(queue.poll());
                } else {
                    stop.push(ing.pop());
                    ing.push(queue.poll());
                }
            }

            if (ing.isEmpty() && !stop.isEmpty()) {
                ing.push(stop.pop());
            }

            if (!ing.isEmpty()) {
                Assignment currAssignment = ing.peek();
                currAssignment.timeLeft--;
                if (currAssignment.timeLeft == 0) {
                    answer[index++] = currAssignment.name;
                    ing.pop();
                }
            }

            curTime = curTime.plusMinutes(1);
        }

        return answer;
    }

    private class Assignment implements Comparable<Assignment> {
        private final String name;
        private final LocalTime startTime;
        private int timeLeft;

        public Assignment(String[] plan) {
            name = plan[0];
            startTime = LocalTime.parse(plan[1], formatter);
            timeLeft = Integer.parseInt(plan[2]);
        }

        public int compareTo(Assignment other) {
            return startTime.compareTo(other.startTime);
        }
    }
}
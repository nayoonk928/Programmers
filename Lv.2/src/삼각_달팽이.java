class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int x = -1, y = 0, num = 1, direction = 0;
        // direction: 0 - down, 1 - right, 2 - up

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (direction == 0) {
                    x++;
                } else if (direction == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                triangle[x][y] = num++;
            }
            direction = (direction + 1) % 3;
        }

        int[] answer = new int[num - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }
        return answer;
    }
}
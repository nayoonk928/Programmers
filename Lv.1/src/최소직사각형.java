import java.util.*;

class Solution {

    public int solution(int[][] sizes) {
        int[] original = getSize(sizes);
        int[] finalSize = getFinalSize(original, sizes);

        return finalSize[0] * finalSize[1];
    }

    private int[] getSize(int[][] sizes) {
        int[] original = new int[2];

        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];

            // 가로 길이가 세로 길이보다 작은 경우, width와 height를 바꿔줌
            if (width < height) {
                int temp = width;
                width = height;
                height = temp;
            }

            if (width > original[0]) {
                original[0] = width;
            }

            if (height > original[1]) {
                original[1] = height;
            }
        }

        return original;
    }

    private int[] getFinalSize(int[] original, int[][] sizes) {
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];

            // 가로 길이가 세로 길이보다 작은 경우, width와 height를 바꿔줌
            if (width < height) {
                int temp = width;
                width = height;
                height = temp;
            }

            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        return new int[]{original[0], maxHeight};
    }
}

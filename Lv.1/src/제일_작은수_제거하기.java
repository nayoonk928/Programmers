class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }

        System.arraycopy(arr, 0, answer, 0, index);
        System.arraycopy(arr, index + 1, answer, index, arr.length - index - 1);

        return answer;
    }
}
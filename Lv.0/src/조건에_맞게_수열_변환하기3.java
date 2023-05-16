class Solution {
    public int[] solution(int[] arr, int k) {
        int len = arr.length;
        if (k % 2 != 0) {
            for (int i = 0; i < len; i++) {
                arr[i] *= k;
            }
        } else {
            for (int i = 0; i < len; i++) {
                arr[i] += k;
            }
        }

        return arr;
    }
}
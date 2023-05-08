class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = "";
        }

        for (int i = 0; i < n; i++) {
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String str2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');

            for (int j = 0; j < n; j++) {
                char c1 = str1.charAt(j);
                char c2 = str2.charAt(j);

                StringBuilder sb = new StringBuilder(answer[i]);
                sb.append((c1 == '0' && c2 == '0') ? " " : "#");
                answer[i] = sb.toString();
            }
        }

        return answer;
    }
}

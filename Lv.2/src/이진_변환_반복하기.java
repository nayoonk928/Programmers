class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;

        while (!s.equals("1")) {
            int len = s.length();

            s = s.replace("0", "");
            zeroCnt += len - s.length();

            s = Integer.toBinaryString(s.length());
            cnt++;
        }

        answer[0] = cnt;
        answer[1] = zeroCnt;
        return answer;
    }
}
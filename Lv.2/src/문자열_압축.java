import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        // 1~문자열길이/2 길이의 문자열 단위로 압축
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, i); // 이전 문자열 초기화
            int cnt = 1; // 압축된 문자열 개수 초기화

            // 이전 문자열부터 문자열 끝까지 i 길이씩 잘라서 확인
            for (int j = i; j <= s.length() - i; j += i) {
                String sub = s.substring(j, j + i);

                // 이전 문자열과 같으면 압축된 개수 증가
                if (prev.equals(sub)) {
                    cnt++;
                } else { // 이전 문자열과 다르면 문자열 압축
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(prev);
                    prev = sub;
                    cnt = 1;
                }
            }

            // 남은 문자열 압축
            if (cnt > 1) {
                sb.append(cnt);
            }
            sb.append(prev);

            // 압축한 문자열의 길이가 더 짧으면 answer 갱신
            if (s.length() % i != 0) { // 남은 문자열이 있을 경우
                sb.append(s.substring(s.length() - s.length() % i));
            }
            answer = Math.min(answer, sb.toString().length());
        }

        return answer;
    }
}
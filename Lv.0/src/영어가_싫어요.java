import java.util.Map;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String str = "";
        String result = "";

        // Map에 Key와 value 추가
        Map<String, String> map = Map.of (
            "zero", "0",
            "one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9"
        );

        // numbers를 한 글자씩 나누면서 str에 더해주고, 
        // 만약 map의 key에 같은 값이 있으면 result에 저장하고 str을 빈 문자열로 초기화 해준다.
        for (int i = 0; i < numbers.length(); i++) {
            str += numbers.substring(i, i+1);
            if (map.containsKey(str)) {
                result += map.get(str);
                str = "";
            }
        }

        // String 형태의 result를 Long형으로 변환
        answer = Long.parseLong(result);
        return answer;
    }
}
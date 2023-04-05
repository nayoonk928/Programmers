import java.util.HashMap;
import java.util.Map;

class 위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, String> hm = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        // clothes 배열을 hm에 저장
        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][0], clothes[i][1]);
        }

        // hm 해시 맵을 돌며 count에 hm의 value를 key로 넣어준다.
        for (Map.Entry<String, String> item : hm.entrySet()) {
            // count 해시 맵이 hm의 value와 같은 key값을 가지고 있지 않다면 count에 key값과 1추가
            // key값이 이미 있다면 해당 key값의 value를 1증가
            if (!count.containsKey(item.getValue())) {
                count.put(item.getValue(), 1);
            } else {
                int num = count.get(item.getValue()) + 1;
                count.replace(item.getValue(), num);
            }
        }

        // (1+a)(1+b) 구현
        for (Map.Entry<String, Integer> item : count.entrySet()) {
            answer *= (1 + item.getValue());
        }

        // answer값에서 가장 높은 차항의 계수 빼기
        return answer - 1;
    }
}
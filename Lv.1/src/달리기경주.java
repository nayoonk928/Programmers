import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= players.length; i++) {
            map.put(i, players[i - 1]);
            map2.put(players[i - 1], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String call = callings[i];
            int index = map2.get(call);

            String frontPlayer = map.get(index - 1);

            map.replace(index, frontPlayer);
            map.replace(index - 1, call);

            map2.replace(call, index - 1);
            map2.replace(frontPlayer, index);
        }

        return map.values().toArray(new String[0]);
    }
}
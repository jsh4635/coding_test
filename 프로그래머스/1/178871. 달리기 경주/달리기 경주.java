import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            int x = map.get(callings[i]);
            int y = x - 1;
            String tmp1 = players[x];
            String tmp2 = players[y];
            map.put(tmp1, y);
            map.put(tmp2, x);
            players[x] = players[y];
            players[y] = tmp1;
        }
        
        return players;
    }
}
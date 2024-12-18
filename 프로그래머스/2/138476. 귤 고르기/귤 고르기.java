import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        Collections.sort(keys, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return map.get(i2) - map.get(i1);
            }
        });
        
        for(Integer i : keys){
            answer++;
            k -= map.get(i);
            if(k <= 0) return answer;
        }
        
        return answer;
    }
}
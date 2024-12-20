import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        int idx = 0;
        
        for(int i = 0; i < progresses.length; i++){
            map.put(i, progresses[i]);
        }
        
        while(idx < progresses.length){
            for(int i = idx; i < progresses.length; i++){
                map.put(i, map.get(i) + speeds[i]);
            }
            
            if(checkIndex(map, idx) - idx > 0){
                list.add(checkIndex(map, idx) - idx);
            }
            idx = checkIndex(map, idx);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int checkIndex(Map<Integer, Integer> map, int idx){
        for(int i = idx; i < map.size(); i++){
            if(i == idx && map.get(i) >= 100) idx++;
        }
        
        return idx;
    }
}
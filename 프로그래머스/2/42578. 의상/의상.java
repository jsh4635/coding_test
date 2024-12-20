import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String[] sArr : clothes){
            List<String> list = map.getOrDefault(sArr[1], new ArrayList<>());
            list.add(sArr[0]);
            map.put(sArr[1], list);
        }
        
        
        for(String s : map.keySet()){
            answer += map.get(s).size() + answer * map.get(s).size();
        }
        
        
        
        return answer;
    }
}
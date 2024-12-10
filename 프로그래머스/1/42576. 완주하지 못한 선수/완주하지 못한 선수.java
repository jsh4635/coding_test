import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> parMap = new HashMap<>();
        Map<String, Integer> comMap = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++){
            if(i < participant.length - 1){
                comMap.put(completion[i], comMap.getOrDefault(completion[i], 0) + 1);
            }
            parMap.put(participant[i], parMap.getOrDefault(participant[i], 0) + 1);
        }
        
        List<String> list = Arrays.stream(participant).distinct().collect(Collectors.toList());
        
        for(String s : list){
            if(comMap.get(s) == null) return s;
            else if(comMap.get(s).equals(parMap.get(s))){
                continue;
            } else return s;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < choices.length; i++){
            if(choices[i] == 4) continue;
            else if(choices[i] < 4){
                String s = survey[i].split("")[0];
                map.put(s, map.getOrDefault(s, 0) + Math.abs(4 - choices[i]));
            }
            else if(choices[i] > 4){
                String s = survey[i].split("")[1];
                map.put(s, map.getOrDefault(s, 0) + Math.abs(4 - choices[i]));
            }
        }
        
        if(map.getOrDefault("R", 0) >= map.getOrDefault("T", 0)) answer += "R";
        else answer += "T";
        if(map.getOrDefault("C", 0) >= map.getOrDefault("F", 0)) answer += "C";
        else answer += "F";
        if(map.getOrDefault("J", 0) >= map.getOrDefault("M", 0)) answer += "J";
        else answer += "M";
        if(map.getOrDefault("A", 0) >= map.getOrDefault("N", 0)) answer += "A";
        else answer += "N";
        
        return answer;
    }
}
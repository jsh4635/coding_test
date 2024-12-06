import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> reg = List.of("aya", "ye", "woo", "ma");
        List<String> reg2 = List.of("ayaaya", "yeye", "woowoo", "mama");
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < reg2.size(); j++){
                babbling[i] = babbling[i].replaceAll(reg2.get(j), "not");
            }
            for(int j = 0; j < reg.size(); j++){
                babbling[i] = babbling[i].replaceAll(reg.get(j), "1");
            }
            babbling[i] = babbling[i].replaceAll("1", "");
            if(babbling[i].isBlank()) answer++;
        }
        
        return answer;
    }
}
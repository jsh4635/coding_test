import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Integer> list = Arrays.stream(s.split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        Collections.sort(list);
        
        answer = list.get(0) + " " + list.get(list.size() - 1);
        
        return answer;
    }
}
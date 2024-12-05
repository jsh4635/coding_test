import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int size = 0;
        
        List<Integer> arr = Arrays.stream(intStrs).filter(str -> 
            k < Integer.parseInt(str.substring(s, s + l))
        ).map(str -> 
            Integer.parseInt(str.substring(s, s + l))
        ).collect(Collectors.toList());
        
        
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
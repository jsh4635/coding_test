import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++){
            arr.add(strArr[i].length());
        }
        
        List<Integer> distinct = arr.stream().distinct().collect(Collectors.toList());
        
        for(Integer i : distinct){
            answer = answer < Collections.frequency(arr, i) ? Collections.frequency(arr, i) : answer;
        }
        
        return answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        List<Integer> numList = new ArrayList<>();
        
        int start = -1;
        int end = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(start == -1) start = i;
                else if(start != -1) end = i;
            }
        }
        
        if(start != -1 && end == -1) end = start;
        else if(start == -1) start = 0;
        
        for(int i = start; i <= end; i++){
            numList.add(arr[i]);
        }
        
        if(numList.size() == 0) numList.add(-1);
        
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(list.size() == 0)list.add(arr[i]);
            else if(list.get(list.size() - 1) == arr[i])list.remove(list.size() - 1);
            else if(list.get(list.size() - 1) != arr[i])list.add(arr[i]);
        }
        
        if(list.size() == 0) list.add(-1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> delList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        
        for(int i = 0; i < arr.length; i++){
            if(!delList.contains(arr[i])) list.add(arr[i]);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
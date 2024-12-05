import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        int num = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        
        list = list.stream().filter(e -> e != num).collect(Collectors.toList());
        
        if(list.isEmpty()) list.add(-1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
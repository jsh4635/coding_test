import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        if(list.get(list.size() - 1) > list.get(list.size() - 2)) list.add(list.get(list.size() - 1) - list.get(list.size() - 2));
        else list.add(list.get(list.size() - 1) * 2);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
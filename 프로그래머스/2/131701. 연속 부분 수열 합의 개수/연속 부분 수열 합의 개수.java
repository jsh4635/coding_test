import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        
        int max = Arrays.stream(elements).boxed().reduce(0, (a, b) -> a + b);
        
        List<Integer> list = Arrays.stream(elements).boxed().collect(Collectors.toList());
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                list.add(list.get(i + j * n) + elements[(i + (j + 1)) % n]);
            }
        }
        
        list = list.stream().distinct().filter(e -> e <= max).collect(Collectors.toList());
        
        return list.size();
    }
}
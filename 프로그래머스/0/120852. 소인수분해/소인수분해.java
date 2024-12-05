import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= n;){
            if(n % i == 0) {
                if(!list.contains(i)){
                    list.add(i);
                }
                n = n / i;
            } else {
                i++;
            }
        }
        if(list.size() == 0) list.add(n);
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
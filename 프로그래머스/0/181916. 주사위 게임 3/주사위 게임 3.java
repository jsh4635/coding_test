import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        
        List<Integer> distinctList = list.stream().sorted().distinct().collect(Collectors.toList());
        
        if(distinctList.size() == 1){
            return distinctList.get(0) * 1111;
        }
        else if(distinctList.size() == 2){
            if(Collections.frequency(list, distinctList.get(0)) == 1){
                return (int)Math.pow( (10 * distinctList.get(1) + distinctList.get(0)), 2);
            }else if(Collections.frequency(list, distinctList.get(0)) == 2){
                return (distinctList.get(0) + distinctList.get(1)) * 
                    Math.abs(distinctList.get(0) - distinctList.get(1));
            }else {
                return (int)Math.pow(10 * distinctList.get(0) + distinctList.get(1), 2);
            }
        }
        else if(distinctList.size() == 3){
            if(Collections.frequency(list, distinctList.get(0)) == 2){
                return distinctList.get(1) * distinctList.get(2);
            }else if(Collections.frequency(list, distinctList.get(1)) == 2){
                return distinctList.get(0) * distinctList.get(2);
            }else if(Collections.frequency(list, distinctList.get(2)) == 2){
                return distinctList.get(1) * distinctList.get(0);
            }
        }
        return distinctList.get(0);
        
    
    }
}
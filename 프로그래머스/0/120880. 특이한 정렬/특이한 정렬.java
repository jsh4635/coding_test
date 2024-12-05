import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        
        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(Math.abs(n - a) == Math.abs(n - b)){
                    return b - a;
                }
                return Math.abs(n - a) - Math.abs(n - b);
            }
        });
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
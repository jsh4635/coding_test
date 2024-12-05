import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int size = 0;
        for(int i = 0; i < query.length; i++){
            size = list.size();
            if(i % 2 == 0){
                for(int j = query[i] + 1; j < size; j++){
                    list.remove(list.size() - 1);
                }
            }else if(i % 2 == 1) {
                for(int j = 0; j < query[i]; j++){
                    list.remove(0);
                }
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
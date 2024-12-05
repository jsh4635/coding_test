import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int i = 0; i < arrayList.size(); i++){
            countMap.put(arrayList.get(i), Collections.frequency(arrayList, arrayList.get(i)));
        }
        
        List<Integer> keyset = new ArrayList<>(countMap.keySet());
        
        boolean check = false;
        
        int value = 0;
        
        for(Integer i : keyset){
            if(value < countMap.get(i)) {
                answer = i;
                value = countMap.get(i);
                check = false;
            } else if(value == countMap.get(i)){
                check = true;
            }
        }
        
        if(check) answer = -1;
        
        return answer;
    }
}
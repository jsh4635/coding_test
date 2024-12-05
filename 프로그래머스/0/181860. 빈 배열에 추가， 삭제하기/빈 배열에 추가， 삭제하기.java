import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> arr1 = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i] * 2; j++){
                    arr1.add(arr[i]);
                    
                }
            } else {
                for(int j = 0; j < arr[i]; j++){
                    arr1.remove(arr1.size() - 1);
                    
                }
            }
        }
        
        int[] answer = arr1.stream().mapToInt(Integer::intValue).toArray();
        
        
        
        return answer;
    }
}
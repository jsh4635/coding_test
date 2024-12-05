import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        List<Integer> resultArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> checkArr = new ArrayList<>();
        while(!checkArr.equals(resultArr)){
            checkArr = new ArrayList<>(resultArr);
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0) arr[i] = arr[i] / 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
            }
            resultArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
            answer++;
        }
        
        
        return answer - 1;
    }
}
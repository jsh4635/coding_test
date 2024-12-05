import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        int n = 1;
        while(length > n){
            n *= 2;
        }
        
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            if(i < length) answer[i] = arr[i];
            else answer[i] = 0;
        }
        
        return answer;
    }
}
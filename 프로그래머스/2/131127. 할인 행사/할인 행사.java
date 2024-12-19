import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i = 0; i < discount.length - 9; i++){
            if(check(want, number, Arrays.copyOfRange(discount, i, i + 10))) answer++;
        }
        
        return answer;
    }
    
    public boolean check(String[] want, int[] number, String[] sArr){
        List<String> list = Arrays.stream(sArr).collect(Collectors.toList());
        
        for(int i = 0; i < number.length; i++){
            if(Collections.frequency(list, want[i]) != number[i]) return false;
        }
        
        return true;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        String[] strArray = my_string.split("");
        
        for(int i = 0; i < indices.length; i++){
            strArray[indices[i]] = "";
        }
        
        answer = Arrays.stream(strArray).collect(Collectors.joining());
        
        return answer;
    }
}
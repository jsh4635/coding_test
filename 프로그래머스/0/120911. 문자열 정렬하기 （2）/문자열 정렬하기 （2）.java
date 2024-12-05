import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        String[] sortedStr = my_string.split("");
        
        Arrays.sort(sortedStr);
        
        answer = Arrays.stream(sortedStr).collect(Collectors.joining());
        
        return answer;
    }
}
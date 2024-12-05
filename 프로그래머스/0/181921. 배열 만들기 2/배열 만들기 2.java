import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int l, int r) {
        String regex = "^[^12346789]*$";
        int[] answer = IntStream.rangeClosed(l, r).filter(e -> String.valueOf(e).matches(regex)).toArray();
        
        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}
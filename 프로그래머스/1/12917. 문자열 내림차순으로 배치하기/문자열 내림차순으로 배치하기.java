import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        
        Arrays.sort(sArr);
        
        StringBuffer sb = new StringBuffer(Arrays.stream(sArr).collect(Collectors.joining()));
        sb = sb.reverse();
        
        return sb.toString();
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        String[] sArr = String.valueOf(n).split("");
        Arrays.sort(sArr);
        StringBuffer sb = new StringBuffer(Arrays.stream(sArr).collect(Collectors.joining()));
        sb = sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
}
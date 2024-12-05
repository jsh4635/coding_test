import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] before1 = before.toCharArray();
        char[] after1 = after.toCharArray();
        
        Arrays.sort(before1);
        Arrays.sort(after1);
        
        answer = new String(before1).equals(new String(after1)) ? 1 : 0;
        
        return answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = Arrays.stream(strArr).filter(s -> !s.contains("ad")).collect(Collectors.toList());
        
        return list.toArray(new String[list.size()]);
    }
}
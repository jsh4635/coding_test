import java.util.*;
import java.util.stream.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        List<String> list = Arrays.stream(s.split("")).collect(Collectors.toList());
        
        int pc = Collections.frequency(list, "p");
        int yc = Collections.frequency(list, "y");

        return pc == yc;
    }
}
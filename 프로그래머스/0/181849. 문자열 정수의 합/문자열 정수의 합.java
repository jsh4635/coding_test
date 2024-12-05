import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String num_str) {
        int answer = Arrays.stream(num_str.split("")).map(s -> Integer.parseInt(s)).reduce(0 , (a, b) -> a + b);
        
        return answer;
    }
}
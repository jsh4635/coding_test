import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("\\s");
        
        List<String> strList = Arrays.stream(arr).filter(s -> s.equals("+") || s.equals("-")).collect(Collectors.toList());
        List<Integer> intList = Arrays.stream(arr)
            .filter(s -> !s.equals("+") && !s.equals("-"))
            .map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        
        answer = intList.get(0);
        
        for(int i = 0; i < strList.size(); i++){
            if(strList.get(i).equals("+")) answer += intList.get(i + 1);
            else if(strList.get(i).equals("-")) answer -= intList.get(i + 1);
        }
        
        return answer;
    }
}
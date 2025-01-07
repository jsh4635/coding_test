import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        List<String> list = Arrays.stream(numbers).boxed().map(e -> String.valueOf(e)).collect(Collectors.toList());
        
        Collections.sort(list, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s1 + s2).compareTo(s2 + s1);
            }
        });
        
        for(int i = list.size() - 1; i >= 0; i--){
            answer += list.get(i);
        }
        
        if(answer.charAt(0) == '0') return "0";
        
        return answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();

        List<List<String>> list = Arrays.stream(quiz)
            .map(s -> Arrays.stream(s.split("\\s")).collect(Collectors.toList()))
            .collect(Collectors.toList());
        
        for(int i = 0; i < list.size(); i++){
            int result = 0;
            if(list.get(i).get(1).equals("+")){
                result = Integer.parseInt(list.get(i).get(0)) + Integer.parseInt(list.get(i).get(2));
                if(result == Integer.parseInt(list.get(i).get(4))) answer.add("O");
                else answer.add("X");
            }else if(list.get(i).get(1).equals("-")){
                result = Integer.parseInt(list.get(i).get(0)) - Integer.parseInt(list.get(i).get(2));
                if(result == Integer.parseInt(list.get(i).get(4))) answer.add("O");
                else answer.add("X");
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
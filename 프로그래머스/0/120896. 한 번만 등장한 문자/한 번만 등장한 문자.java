import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        
        String value = strArr[0];
        
        answer += value;
        
        for(int i = 1; i < strArr.length; i++){
            if(value.equals(strArr[i])) answer = answer.replaceAll(strArr[i], "");
            else if(!value.equals(strArr[i])) {
                value = strArr[i];
                answer += value;
            }
        }
        
        return answer;
    }
}
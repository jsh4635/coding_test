import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        Pattern pattern = Pattern.compile("[0-9]");
        
        for(int i = 0; i < my_string.length(); i++){
            if(Pattern.matches("[0-9]", String.valueOf(my_string.charAt(i)))){
                answer += Integer.valueOf(String.valueOf(my_string.charAt(i)));
            } 
        }
        
        return answer;
    }
}
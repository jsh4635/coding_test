class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuffer subString = new StringBuffer(my_string.substring(s, e + 1));
        
        answer = my_string.replace(subString.toString(), subString.reverse().toString());
        
        return answer;
    }
}
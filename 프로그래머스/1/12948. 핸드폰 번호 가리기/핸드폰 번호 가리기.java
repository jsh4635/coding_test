class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String s = phone_number.substring(0, phone_number.length() - 4);
        String m = "";
        
        for(int i = 0; i < s.length(); i++){
            m += "*";
        }
        
        answer = phone_number.replace(s, m);
        
        return answer;
    }
}
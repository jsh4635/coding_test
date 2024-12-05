class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        //65 90
        //97 122
        
        for(int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).isBlank()) answer += String.valueOf(s.charAt(i));
            else {
                char c = s.charAt(i);
                if('a' <= c && c <= 'z' && Integer.valueOf(c) + n > 122){
                    c -= 26;
                }
                else if('A' <= c && c <= 'Z' && Integer.valueOf(c) + n > 90){
                    c -= 26;
                }
                for(int j = 0; j < n; j++){
                    c += 1;
                }
                answer += String.valueOf(c);
            }
        }
        
        return answer;
    }
}
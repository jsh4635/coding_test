class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] arrayStr = cipher.split("");
        
        for(int i = 0; i < arrayStr.length; i++){
            if((i + 1) % code == 0) answer += arrayStr[i];
        }
        
        return answer;
    }
}
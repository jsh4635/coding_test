class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split("");
        
        int idx = 0;
        
        for(String str : sArr){
            if(str.isBlank()){
                idx = 0;
                answer += str;
            }
            else{
                if(idx % 2 == 0) answer += str.toUpperCase();
                else if(idx % 2 == 1) answer += str.toLowerCase();
                idx++;
            }
        }
        
        return answer;
    }
}
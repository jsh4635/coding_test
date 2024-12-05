class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1'){
                mode = mode == 1 ? 0 : 1;
                continue;
            }
            if(i % 2 == mode){
                answer += code.charAt(i);
            }
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}
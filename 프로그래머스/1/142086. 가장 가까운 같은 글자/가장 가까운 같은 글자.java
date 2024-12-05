class Solution {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++){
            answer[i] = -1;
            for(int j = i - 1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = i - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}
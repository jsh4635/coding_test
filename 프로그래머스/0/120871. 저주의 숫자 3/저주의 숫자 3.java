class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n;){
            answer++;
            if(String.valueOf(answer).contains("3") || answer % 3 == 0) continue;
            
            i++;
        }
        
        return answer;
    }
}
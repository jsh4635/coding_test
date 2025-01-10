class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0){
            int num = storey % 10;
            int check = storey % 100 / 10;
            
            answer += num < 5 ? num : 10 - num;
            storey += num < 5 ? -num : num > 5 ? 10 - num : check >= 5 ? num : -num;
            
            storey /= 10;
        }
        
        return answer;
    }
}
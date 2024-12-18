class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int n = brown + yellow;
        
        int r = 0;
        
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(((n / i) - 2) * (i - 2) == yellow){
                    r = i;
                    break;
                }
            }
        }
        
        answer[0] = n / r >= r ? n / r : r;
        answer[1] = n / r < r ? n / r : r;
        
        return answer;
    }
}
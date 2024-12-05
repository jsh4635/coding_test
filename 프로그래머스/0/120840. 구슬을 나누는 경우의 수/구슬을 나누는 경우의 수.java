class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        
        for(int i = share + 1; i <= balls; i++){
            answer *= i;
        }        
        for(int i = 2; i <= balls - share; i++){
            answer /= i;
        }
                
        return (int)Math.round(answer);
    }
}
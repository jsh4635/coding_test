class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        long start = (long)a > b ? b : a == b ? a : a;
        long end = (long)a > b ? a : b == a ? a : b;
        
        for(long i = start; i <= end; i++){
            answer += i;
        }
        
        return answer;
    }
}
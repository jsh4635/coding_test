class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(long i = 1; i <= r2; i++){
            long y1 = (long)Math.floor(Math.sqrt(1.0 * r2 * r2 - 1.0 * i * i));
            long y2 = (long)Math.ceil(Math.sqrt(1.0 * r1 * r1 - 1.0 * i * i));
            answer += (y1 - y2 + 1);
        }
        
        answer *= 4;
        
        return answer;
    }
}
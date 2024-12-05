class Solution {
    public long solution(long n) {
        if(Math.sqrt(n) == (long)Math.sqrt(n)) return (long)Math.pow((long)Math.sqrt(n) + 1, 2);
        
        return -1L;
    }
}
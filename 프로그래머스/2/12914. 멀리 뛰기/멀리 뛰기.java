class Solution {
    public long solution(int n) {
        if(n == 1 || n == 2) return (long)n;
        
        long[] l = new long[n];
        
        l[0] = 1;
        l[1] = 2;
        
        for(int i = 2; i < n; i++){
            l[i] = (l[i - 1] + l[i - 2]) % 1234567;
        }
        
        return l[n - 1];
    }
}
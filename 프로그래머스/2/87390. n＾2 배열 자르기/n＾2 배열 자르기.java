import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] a = new int[(int)(right - left + 1)];
        
        int idx = 0;
        
        for(long i = left; i <= right; i++){
            a[idx] = (int)Math.max(i/n, i%n) + 1;
            idx++;
        }
        
        return a;
    }
}
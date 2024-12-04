import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int a = (int)Math.pow(Arrays.stream(num_list).sum(), 2);
        int b = Arrays.stream(num_list).reduce(1, (n, m) -> n * m);
        
        return a > b ? 1 : 0;
    }
}
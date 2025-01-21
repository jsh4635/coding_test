import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        int m = -1;
        for(int[] target : targets){
            if(m == -1){
                answer++;
                m = target[1];
                continue;
            }
            
            if(target[0] < m && m <= target[1]) continue;
            
            answer++;
            m = target[1];
        }
        
        return answer;
    }
}
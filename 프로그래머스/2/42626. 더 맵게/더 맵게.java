import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        Arrays.sort(scoville);
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            q.offer(scoville[i]);
        }
        
        while(q.peek() < K){
            if(q.size() < 2){
                return -1;
            }
            int n = q.poll();
            int m = q.poll();
            n = n + (m * 2);
            q.offer(n);
            answer++;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        int length = queue1.length * 2 + 1;
        
        long sum1 = 0;
        long sum2 = 0;
        
        for(int i = 0; i < queue1.length; i++){
            q1.offer(queue1[i]);
            sum1 += queue1[i];
            q2.offer(queue2[i]);
            sum2 += queue2[i];
        }
        
        int count = 0;
        if(sum1 == sum2) return count;
        if((sum1 + sum2) % 2 == 1L) return -1;
        while(!q1.isEmpty() && !q2.isEmpty() && count <= length){
            int n1 = q1.peek();
            int n2 = q2.peek();
            
            if(sum1 < sum2){
                sum1 += n2;
                sum2 -= n2;
                q1.offer(q2.poll());
            }else{
                sum1 -= n1;
                sum2 += n1;
                q2.offer(q1.poll());
            }
            count++;
            
            if(sum1 == sum2) return count;
        }
        
        return answer;
    }
}
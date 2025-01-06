import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        int num = 1;
        int idx = 0;
        while(idx < order.length){
            int target = order[idx];
            if(num < target){
                while(num < target){
                    stack.push(num);
                    num++;
                }
            } 
            if(num == target){
                answer++;
                num++;
            } else {
                if(stack.isEmpty() || stack.peek() != target) break;
                else{
                    answer++;
                    stack.pop();
                }
            }
            idx++;
        }
        
        return answer;
    }
}
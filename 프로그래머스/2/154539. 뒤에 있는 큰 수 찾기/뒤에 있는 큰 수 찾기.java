import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        answer[numbers.length - 1] = -1;
        
        Stack<Integer> stack = new Stack<>();
        
        int idx = numbers.length - 2;
        
        for(int i = numbers.length - 2; i >= 0; i--){
            answer[idx] = -1;
            if(numbers[i + 1] > numbers[i]){
                answer[idx] = numbers[i + 1];
                idx--;
                stack.push(numbers[i + 1]);
            } else{
                while(!stack.isEmpty()){
                    int num = stack.peek();
                    if(num > numbers[i]){
                        answer[idx] = num;
                        break;
                    }else stack.pop();
                }
                idx--;
            }
        }
        
        return answer;
    }
}
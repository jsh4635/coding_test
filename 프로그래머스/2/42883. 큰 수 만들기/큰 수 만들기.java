import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String number, int k) {
        String[] nArr = number.split("");
        
        StringBuffer sb = new StringBuffer();
        
        Stack<String> stack = new Stack<>();
        
        stack.push(nArr[0]);
        
        int idx = k;
        
        for(int i = 1; i < nArr.length; i++){
            while(!stack.isEmpty() && idx > 0 && stack.peek().compareTo(nArr[i]) < 0){
                idx--;
                stack.pop();
            }
            stack.push(nArr[i]);
        }
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().substring(0, nArr.length - k);
    }
}
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int i = 0; i < priorities.length; i++){
            list.add(priorities[i]);
            list2.add(i == location ? 1 : 0);
        }
        
        while(!list.isEmpty()){
            int n = list.remove(0);
            int idx = list2.remove(0);
            if(check(n, list)) {
                answer++;
                if(idx == 1) return answer;
            }
            else {
                list.add(n);
                list2.add(idx);
            }
        }
        
        return answer;
    }
    
    public boolean check(int n, List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(n < list.get(i)) return false;
        }
        return true;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int first = 0;
        int second = 0;
        int third = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]) map.put(rank[i], i);
        }
        
        List<Integer> sortValue = new ArrayList<>(map.keySet());
        
        Collections.sort(sortValue);
        
        int check = 10000;
        
        for(Integer key : sortValue){
            if(check > 0){
                answer += check * map.get(key);
                check /= 100;
            }else {
                break;
            }
        }
        
        
        return answer;
    }
}
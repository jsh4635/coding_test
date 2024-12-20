import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        for(String s : cities){
            s = s.toLowerCase();
            if(list.size() > 0){
                if(list.contains(s)){
                    answer++;
                    int idx = list.indexOf(s);
                    list.remove(idx);
                }else {
                    answer += 5;
                    if(list.size() == cacheSize){
                        list.remove(0);
                    }
                }
            }else{
                answer += 5;
            }
            
            if(cacheSize > 0){
                list.add(s);
            }
        }
        
        return answer;
    }
}
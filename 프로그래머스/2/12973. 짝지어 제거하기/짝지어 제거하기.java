import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        
        for(String e : s.split("")){
            if(list.size() == 0) list.add(e);
            else {
                if(list.get(list.size() - 1).equals(e)) list.remove(list.size() - 1);
                else list.add(e);
            }
        }
        
        if(list.size() == 0) return 1;

        return 0;
    }
}
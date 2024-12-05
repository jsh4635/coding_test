import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        
        int start = -1;
        int end = -1;
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")) {
                start = 0;
                end = i;
                break;
            }
            else if(str_list[i].equals("r")) {
                start = i + 1;
                end = str_list.length;
                break;
            }
        }
        
        for(int i = start; i < end; i++){
            list.add(str_list[i]);
        }
        
        return list.toArray(new String[list.size()]);
    }
}
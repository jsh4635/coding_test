import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        String reg = "[a-z]{2}";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        int same = 0;
        
        for(int i = 0; i < str1.length() - 1; i++){
            String s = str1.substring(i, i + 2);
            if(!s.matches(reg)) continue;
            list1.add(s);
        }
        
        for(int i = 0; i < str2.length() - 1; i++){
            String s = str2.substring(i, i + 2);
            if(!s.matches(reg)) continue;
            list2.add(s);
        }
        
        for(String s : list1){
            if(list2.contains(s)) {
                list2.remove(s);
                same++;
            }
        }
        
        if(list1.size() + list2.size() == 0) return 65536;
        
        return 65536 * same / (list1.size() + list2.size());
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String s = Arrays.stream(spell).sorted().collect(Collectors.joining());
        System.out.println(s);
        for(int i = 0; i < dic.length; i++){
            String str = Arrays.stream(dic[i].split("")).sorted().collect(Collectors.joining());
            if(s.equals(str)) return 1;
        }
        
        return 2;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String[] sArr = s.split("");
        
        int check = 0;
        
        for(int i = 0; i < sArr.length; i++){
            if(check == 0 && !sArr[i].matches("\\s")){
                check++;
                sArr[i] = sArr[i].toUpperCase();
            }else if(check != 0 && sArr[i].matches("\\s")){
                check = 0;
            }
        }
        
        s = Arrays.stream(sArr).collect(Collectors.joining());
        
        return s;
    }
}
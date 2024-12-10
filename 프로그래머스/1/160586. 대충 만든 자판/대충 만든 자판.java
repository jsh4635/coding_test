import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        List<List<String>> list = Arrays.stream(keymap).map(e -> Arrays.stream(e.split("")).collect(Collectors.toList())).collect(Collectors.toList());
        
        for(int i = 0; i < targets.length; i++){
            int num = 0;
            for(String s : targets[i].split("")){
                int idx = -1;
                for(List<String> sList : list){
                    int n = sList.indexOf(s);
                    if(n != -1 && idx == -1) idx = n;
                    else if(n != -1 && n < idx) idx = n;
                }
                if(idx > -1) num += idx + 1;
                else {
                    num = -1;
                    break;
                }
            }
            answer[i] = num;
        }
        
        return answer;
    }
}
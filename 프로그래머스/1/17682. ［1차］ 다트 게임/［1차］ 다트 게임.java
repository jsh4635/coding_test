import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] sArr = dartResult.split("");
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].matches("[0-9]")) list.add(Integer.parseInt(sArr[i]));
            else if(sArr[i].equals("S")) continue;
            else if(sArr[i].equals("D")) {
                int last = list.remove(list.size() - 1);
                list.add((int)Math.pow(last, 2));
            }
            else if(sArr[i].equals("T")) {
                int last = list.remove(list.size() - 1);
                list.add((int)Math.pow(last, 3));
            }
            else if(sArr[i].equals("*")) {
                list = list.stream().map(e -> e * 2).collect(Collectors.toList());
            }
            else if(sArr[i].equals("#")) {
                int last = list.remove(list.size() - 1);
                list.add(last * (-1));
            }
        }
        
        return list.stream().reduce(0, (a, b) -> a + b);
    }
}
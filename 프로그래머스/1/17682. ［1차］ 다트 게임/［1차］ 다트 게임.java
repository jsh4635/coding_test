import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] sArr = dartResult.split("");
        
        List<Integer> list = new ArrayList<>();
        
        String value = "";
        
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].matches("[0-9]")) value += sArr[i];
            if(sArr[i].equals("S")) {
                list.add(Integer.parseInt(value));
                value = "";
            }
            else if(sArr[i].equals("D")) {
                list.add((int)Math.pow(Integer.parseInt(value), 2));
                value = "";
            }
            else if(sArr[i].equals("T")) {
                list.add((int)Math.pow(Integer.parseInt(value), 3));
                value = "";
            }
            else if(sArr[i].equals("*")) {
                int n = list.remove(list.size() - 1);
                if(list.size() > 0){
                    int m = list.remove(list.size() - 1);
                    list.add(m * 2);
                }
                list.add(n * 2);
            }
            else if(sArr[i].equals("#")) {
                int last = list.remove(list.size() - 1);
                list.add(last * (-1));
            }
        }
        
        return list.stream().reduce(0, (a, b) -> a + b);
    }
}
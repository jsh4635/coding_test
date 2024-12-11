import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        
        for(String x : X.split("")){
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
        }
        for(String y : Y.split("")){
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        
        List<String> sList = new ArrayList<>();
        
        for(String key : xMap.keySet()){
            if(xMap.getOrDefault(key, 0) > 0 && yMap.getOrDefault(key, 0) > 0){
                int length = xMap.get(key) <= yMap.get(key) ? xMap.get(key) : yMap.get(key);
                for(int i = 0; i < length; i++){
                    sList.add(key);
                }
            }
        }
        
        Collections.sort(sList);
        Collections.reverse(sList);
        
        String s = sList.size() > 0 ? sList.stream().collect(Collectors.joining()) : "";
        
        s = s.matches("0+") ? "0" : s;
        
        return s.isBlank() ? "-1" : s;
    }
}
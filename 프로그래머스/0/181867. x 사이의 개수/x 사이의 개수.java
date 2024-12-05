import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
        String[] sArr = myString.split("x", -1);
        
        for(int i = 0; i < sArr.length; i++){
            list.add(sArr[i].length());
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
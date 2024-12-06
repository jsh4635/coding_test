import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == su1[i % su1.length]) map.put(1, map.getOrDefault(1, 0) + 1);
            if(answers[i] == su2[i % su2.length]) map.put(2, map.getOrDefault(2, 0) + 1);
            if(answers[i] == su3[i % su3.length]) map.put(3, map.getOrDefault(3, 0) + 1);
        }
        int max = Collections.max(map.values());
        
        for(Integer i : map.keySet()){
            if(max == map.get(i)) list.add(i);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
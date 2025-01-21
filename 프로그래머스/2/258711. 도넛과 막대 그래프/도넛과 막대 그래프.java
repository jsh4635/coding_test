import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        
        Map<Integer, Integer> smap = new HashMap<>();
        Map<Integer, Integer> emap = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        
        for(int[] i : edges){
            smap.put(i[0], smap.getOrDefault(i[0], 0) + 1);
            emap.put(i[1], emap.getOrDefault(i[1], 0) + 1);
            set.add(i[0]);
            set.add(i[1]);
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        for(int i : list){
            if(smap.getOrDefault(i, 0) >= 2 && emap.getOrDefault(i, 0) == 0) answer[0] = i;
            else if(smap.getOrDefault(i, 0) == 0 && emap.getOrDefault(i, 0) >= 1) answer[2]++;
            else if(smap.getOrDefault(i, 0) == 2 && emap.getOrDefault(i, 0) >= 2) answer[3]++;
        }
        
        answer[1] = smap.get(answer[0]) - (answer[2] + answer[3]);
        
        return answer;
    }
}
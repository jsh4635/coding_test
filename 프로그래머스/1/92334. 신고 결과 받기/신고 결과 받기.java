import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Set<String>> map2 = new HashMap<>();
        
        List<Integer> list = new ArrayList<>();
        
        for(String s : report){
            Set<String> set = map.getOrDefault(s.split("\\s+")[1], new HashSet<>());
            set.add(s.split("\\s+")[0]);
            map.put(s.split("\\s+")[1], set);
            Set<String> set2 = map2.getOrDefault(s.split("\\s+")[0], new HashSet<>());
            set2.add(s.split("\\s+")[1]);
            map2.put(s.split("\\s+")[0], set2);
        }
        
        for(String id : id_list){
            int check = 0;
            Set<String> set1 = map2.getOrDefault(id, new HashSet<>());
            List<String> setList = new ArrayList<>(set1);
            for(int i = 0; i < setList.size(); i++){
                Set<String> set2 = map.getOrDefault(setList.get(i), new HashSet<>());
                if(set2.size() >= k) check++;
            }
            list.add(check);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
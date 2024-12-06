import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int num = stages.length;
        
        List<Integer> stageList = Arrays.stream(stages).boxed().collect(Collectors.toList());
        List<Integer> countList = new ArrayList<>();
        
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i = 1; i <= N; i++){
            countList.add(Collections.frequency(stageList, i));
        }
        
        for(int i = 0; i < countList.size(); i++){
            if(num > 0){
                map.put(i + 1, (double) countList.get(i) / (double)num);
            }else if(num == 0){
                map.put(i + 1, 0.0);
            }
            num -= countList.get(i);
        }
        
        List<Integer> keysets = new ArrayList<>(map.keySet());
        
        keysets.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return map.get(o1).compareTo(map.get(o2)) > 0 ? -1 : map.get(o1).compareTo(map.get(o2)) == 0 ? o1 - o2 : 1;
            }
        });
        
        return keysets.stream().mapToInt(Integer::intValue).toArray();
    }
}
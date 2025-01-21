import java.util.*;

class Solution {
    public int[] solution(int[][] dice) {
        int size = dice.length;
        int[] answer = new int[size / 2];
        
        int[][] copy = new int[size][6];
        for(int i = 0; i < size; i++){
            copy[i] = Arrays.copyOf(dice[i], 6);
        }
        
        int max = 0;
        int[] me = new int[size / 2];
        
        Map<int[], List<Integer>> map = new HashMap<>();
        makeDice(copy, me, 0, 1, map, size);
        
        List<int[]> list = new ArrayList<>(map.keySet());
        
        for(int i = 0; i < list.size(); i++){
            int[] key = list.get(i);
            for(int j = 0; j < list.size(); j++){
                if(i == j) continue;
                int[] key2 = list.get(j);
                
                boolean flag = false;
                
                for(int n = 0; n < key.length; n++){
                    for(int m = 0; m < key2.length; m++){
                        if(key[n] == key2[m]){
                            flag = true;
                            break;
                        }
                    }
                    if(flag) break;
                }
                if(flag) continue;
                
                List<Integer> com1 = map.get(key);
                List<Integer> com2 = map.get(key2);
                
                Collections.sort(com1);
                Collections.sort(com2);
                
                int win = 0;
                
                for(int n = 0; n < com1.size(); n++){
                    int s = 0;
                    int e = com1.size();
                    int num = com1.get(n);
                    while(s < e){
                        int m = (s + e) / 2;
                        if(num <= com2.get(m)){
                            e = m;
                        }else s = m + 1;
                    }
                    win += e;
                }
                if(max < win){
                    answer = key;
                    max = win;
                }
            }
        }
        
        return answer;
    }
    
    public void makeDice(int[][] copy, int[] me, int depth, int cur, Map<int[], List<Integer>> map, int size){
        if(depth == size / 2){
            int[] temp = new int[me.length];
            map.put(temp, new ArrayList<>());
            makeSum(copy, me, 0, 0, temp, map, size);
            return;
        }
        
        for(int i = cur; i < size + 1; i++){
            me[depth] = i;
            makeDice(copy, me, depth + 1, cur + 1, map, size);
        }
    }
    
    public void makeSum(int[][] copy, int[] me, int depth, int sum, int[] temp, Map<int[], List<Integer>> map, int size){
        if(depth == size / 2){
            map.get(temp).add(sum);
            return;
        }
        
        for(int i = 0; i < 6; i++){
            makeSum(copy, me, depth + 1, sum + copy[me[depth] - 1][i], temp, map, size);
        }
    }
    
}
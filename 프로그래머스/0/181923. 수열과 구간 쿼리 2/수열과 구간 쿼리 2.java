import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
            
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int v = -1;
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    v = v == -1 ? arr[j] : arr[j] < v ? arr[j] : v;
                }
            }
            list.add(v);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
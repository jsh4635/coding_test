import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int lidx = 0;
        int ridx = 0;
        
        int sum = sequence[0];
        
        int length = sequence.length;
        
        List<int[]> list = new ArrayList<>();
        
        while(lidx < length && ridx < length){
            if(sum == k) list.add(new int[]{lidx,ridx});
            if(sum <= k) {
                ridx++;
                if(ridx < length){
                    sum += sequence[ridx];
                }
            }
            else if(sum > k) {
                if(lidx < length){
                    sum -= sequence[lidx];
                }
                lidx++;
            }
        }
        
        Collections.sort(list, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                int l1 = o1[1] - o1[0];
                int l2 = o2[1] - o2[0];
                return l1 - l2;
            }
        });
        
        return list.get(0);
    }
}
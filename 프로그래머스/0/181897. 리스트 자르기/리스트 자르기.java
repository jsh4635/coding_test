import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int start = 0;
        int end = num_list.length - 1;
        int check = 1;
        
        if(n == 1) end = slicer[1];
        else if(n == 2)start = slicer[0];
        else {
            start = slicer[0];
            end = slicer[1];
            if(n == 4) check = slicer[2];
        }
        List<Integer> arr = new ArrayList<>();
        
        for(int i = start; i <= end; i = i + check){
            arr.add(num_list[i]);
        }
                
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}
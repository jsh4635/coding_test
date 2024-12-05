import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
            if(row < sizes[i][0]){
                row = sizes[i][0];
            }
            if(col < sizes[i][1]){
                col = sizes[i][1];
            }
        }
        
        return row * col;
    }
}
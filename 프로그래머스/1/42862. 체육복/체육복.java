import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] stu = new int[n];
        Arrays.fill(stu, 1);
        
        for(int i : lost){
            stu[i - 1]--;
        }
        
        for(int i : reserve){
            stu[i - 1]++;
        }
        
        
        for(int i = 0; i < stu.length; i++){
            if(stu[i] == 0){
                check(stu, i);
            }
        }
        
        for(int i : stu){
            if(i > 0) answer++;
        }
        
        return answer;
    }
    
    public void check(int[] stu, int i){
        if(i == 0){
            if(stu[i + 1] == 2) {
                stu[i + 1] --;
                stu[i]++;
            }
        }else if(i == stu.length - 1){
            if(stu[i - 1] == 2) {
                stu[i - 1] --;
                stu[i]++;
            }
        }else{
            if(stu[i - 1] == 2) {
                stu[i - 1] --;
                stu[i]++;
            } else if(stu[i + 1] == 2) {
                stu[i + 1] --;
                stu[i]++;
            }
        }
    }
}
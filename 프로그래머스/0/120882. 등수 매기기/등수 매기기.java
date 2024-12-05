import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        int[] answer = new int[length];
        int[] sumScore = new int[length];
        
        for(int i = 0; i < length; i++){
            sumScore[i] = score[i][0] + score[i][1];
        }
        
        Arrays.sort(sumScore);
        
        List<Integer> reverse = Arrays.stream(sumScore).boxed().collect(Collectors.toList());
        
        Collections.reverse(reverse);
        
        sumScore = reverse.stream().mapToInt(Integer::intValue).toArray();
        
        int[] arr = new int[length];
        arr[0] = 1;
        
        for(int i = 1; i < length; i++){
            if(sumScore[i] == sumScore[i - 1]){
                arr[i] = arr[i - 1];
            }
            else arr[i] = i + 1;
        }
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(score[i][0] + score[i][1] == sumScore[j]){
                    answer[i] = arr[j];
                }
            }
        }
        
        return answer;
    }
}
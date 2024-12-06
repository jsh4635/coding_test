import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] checks = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == su1[i % su1.length]) checks[0]++;
            if(answers[i] == su2[i % su2.length]) checks[1]++;
            if(answers[i] == su3[i % su3.length]) checks[2]++;
        }
        int max = Math.max(checks[0], Math.max(checks[1], checks[2]));
        
        for(int i = 0; i < checks.length; i++){
            if(max == checks[i]) list.add(i + 1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
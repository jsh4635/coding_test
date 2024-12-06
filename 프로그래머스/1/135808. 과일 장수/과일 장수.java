import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        for(int i = m - 1; i < list.size(); i += m){
            answer += list.get(i) * m;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = num_list.length > 10 ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        return answer;
    }
}
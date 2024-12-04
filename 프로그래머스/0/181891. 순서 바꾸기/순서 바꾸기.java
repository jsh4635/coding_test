import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = IntStream.concat(Arrays.stream(num_list).skip(n), Arrays.stream(num_list).limit(n)).toArray();
        return answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        return Arrays.stream(nums).boxed().distinct().collect(Collectors.toList()).size() > nums.length / 2 ? nums.length / 2 : Arrays.stream(nums).boxed().distinct().collect(Collectors.toList()).size();
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(long n) {
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s = s.reverse();
        List<Integer> list = Arrays.stream(s.toString().split("")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
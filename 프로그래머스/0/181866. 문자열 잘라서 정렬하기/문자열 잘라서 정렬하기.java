import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = Arrays.stream(myString.split("x")).filter(s -> !s.isBlank()).collect(Collectors.toList());
        Collections.sort(list);
        return list.toArray(new String[list.size()]);
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
            
        List<String> arr1 = Arrays.stream(arr).filter(s -> !"".equals(s)).collect(Collectors.toList());
        
        String[] answer = arr1.size() == 0 ? new String[]{"EMPTY"} : arr1.toArray(new String[arr1.size()]);
        
        
        return answer;
    }
}
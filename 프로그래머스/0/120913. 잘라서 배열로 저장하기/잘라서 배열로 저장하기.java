import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        
        int length = my_str.length() / n;
        int check = my_str.length() % n == 0 ? 0 : 1;
        
        for(int i = 0; i < length + check; i++){
            if(i == length - 1 + check){
                list.add(my_str.substring((0 + (n * i))));
            } else {
                list.add(my_str.substring((0 + (n * i)), n * (i + 1)));
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}
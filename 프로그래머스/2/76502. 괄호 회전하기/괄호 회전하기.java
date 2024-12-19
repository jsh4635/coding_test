import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int n = s.length();
        
        StringBuffer sb = new StringBuffer(s);
        
        for(int i = 0; i < n; i++){
            if(check(sb.toString().split(""))) answer++;
            sb.insert(0, sb.substring(1));
            sb.setLength(n);
        }
        
        return answer;
    }
    
    public boolean check(String[] sArr){
        List<String> list = new ArrayList<>();
        
        for(String s : sArr){
            if(s.equals("(") || s.equals("{") || s.equals("[")) list.add(s);
            else if(list.size() > 0){
                if(s.equals(")")){
                    if(list.get(list.size() - 1).equals("(")) list.remove(list.size() - 1);
                    else return false;
                }
                else if(s.equals("}")){
                    if(list.get(list.size() - 1).equals("{")) list.remove(list.size() - 1);
                    else return false;
                }
                else if(s.equals("]")){
                    if(list.get(list.size() - 1).equals("[")) list.remove(list.size() - 1);
                    else return false;
                }
            } else return false;
        }
        
        if(list.size() != 0) return false;
        
        return true;
    }
    
}
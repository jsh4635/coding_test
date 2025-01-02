import java.util.*;

class Solution {
    Map<Integer, String> map = new HashMap<>();
    
    private int idx = 0;
    
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        char c = 65;
        for(int i = 10; i < 16; i++){
            map.put(i, c + "");
            c += 1;
        }
        int num = 0;
        while(answer.length() < t){
            answer += converter(n, num, m, p);
            num++;
        }
        
        if(answer.length() > t){
            answer = answer.substring(0, t);
        }
        
        return answer;
    }
    
    public String converter(int n, int m, int member, int p){
        StringBuffer sb = new StringBuffer();
        if(m == 0) sb.append(0);
        while(m > 0){
            int num = m % n;
            if(num > 9) sb.append(map.get(num));
            else sb.append(num);
            m /= n;
        }
        
        String str = "";
        
        String s = sb.reverse().toString();
        
        for(int i = 0; i < s.length(); i++){
            if((i + idx) % member == p - 1) str += s.charAt(i) + "";
        }
        idx += s.length();
        
        return str;
    }
}
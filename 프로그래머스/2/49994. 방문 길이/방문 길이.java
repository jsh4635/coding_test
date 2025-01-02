import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        Set<String> set = new HashSet<>();
        
        int x = 0;
        int y = 0;
        
        for(String s : dirs.split("")){
            int nx = x;
            int ny = y;
            String op = "";
            switch (s){
                case "U":{
                    if(y < 5){
                        ny++;
                        op = "D";
                    }
                    break;
                }
                case "D":{
                    if(y > -5){
                        ny--;
                        op = "U";
                    }
                    break;
                }
                case "R":{
                    if(x < 5){
                        nx++;
                        op = "L";
                    }
                    break;
                }
                case "L":{
                    if(x > -5){
                        nx--;
                        op = "R";
                    }
                    break;
                }
            }
            if(op.isEmpty()) continue;
            String go = s + nx + ny;
            String re = op + x + y;
            if(!set.contains(go) && !set.contains(re)) set.add(go);
            x = nx;
            y = ny;
        }
        
        return set.size();
    }
}
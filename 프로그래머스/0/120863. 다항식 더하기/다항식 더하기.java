import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String[] strArr = polynomial.split("\\s");
        
        
        List<String> numList = new ArrayList<>();
        
        int x = 0;
        
        int num = 0;
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals("+")) numList.add(strArr[i]);
        }
        
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i).endsWith("x")) x += Integer.parseInt(numList.get(i).replace("x", "").equals("") ? "1" : numList.get(i).replace("x", ""));
            else num += Integer.parseInt(numList.get(i));
        }
        
        String answer = "";
        
        if(x == 0){
            return "" + num;
        }
        else if(x == 1){
            if(num == 0){
                answer = "x";
            }
            else answer += "x + " + num;
        }else {
            if(num == 0) answer += x + "x";
            else answer += x + "x + " + num;
        }
        
        return answer;
    }
}
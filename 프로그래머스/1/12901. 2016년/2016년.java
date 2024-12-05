class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int d = 0;
        
        for(int i = 1; i < a; i++){
            if(i == 2) d += 29;
            else if(i < 8 && i % 2 == 1) d += 31;
            else if(i < 8 && i % 2 == 0) d += 30;
            else if(i % 2 == 0) d += 31;
            else if(i % 2 == 1) d += 30;
        }
        d += b;
        
        if(d % 7 == 0) answer = "THU";
        else if(d % 7 == 1) answer = "FRI";
        else if(d % 7 == 2) answer = "SAT";
        else if(d % 7 == 3) answer = "SUN";
        else if(d % 7 == 4) answer = "MON";
        else if(d % 7 == 5) answer = "TUE";
        else if(d % 7 == 6) answer = "WED";
        
        return answer;
    }
}
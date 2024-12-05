class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = "";
        
        while(n > 0){
            s += String.valueOf(n % 3);
            n /= 3;
        }
        
        for(int i = s.length() - 1; i >= 0; i--){
            answer += Math.pow(3, s.length() - 1 - i) * Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        int num = a(s, 0);
        
        return num;
    }
    
    private int a(String s, int num){
        if(s.isBlank()){
            return num;
        }
        int end = 0;
        int n = 1, m = 0;
        char c = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(c == s.charAt(i)) n++;
            else if(c != s.charAt(i)) m++;
            if(n == m) {
                end = i + 1;
                break;
            }
        }
        if(m != n) return num + 1;
        
        return a(s.substring(end), num + 1);
    }
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLength = p.length();
        int tLength = t.length();
        
        long pNum = Long.parseLong(p);
                
        for(int i = 0; i < tLength - pLength + 1; i++){
            if(pNum >= Long.parseLong(t.substring(i, i + pLength))) answer++;
        }
        
        return answer;
    }
}
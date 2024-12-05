class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        String substr = A;
        
        if(A.equals(B)) return 0;
        
        for(int i = 0; i < A.length() - 1; i++){
            substr = substr.substring(A.length() - 1) + substr.substring(0, A.length() - 1);
            if(substr.equals(B)) return i + 1;
        }
        
        return answer;
    }
}
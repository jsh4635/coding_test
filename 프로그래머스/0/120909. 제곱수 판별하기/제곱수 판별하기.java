class Solution {
    public int solution(int n) {
        int answer = 0;
        
        Double value = Math.sqrt(n);
        
        if(value == value.intValue()){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
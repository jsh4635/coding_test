class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[length];
        answer[0] = 1;
        for(int i = 1; i < length; i++){
            answer[i] = answer[i - 1] + 2;
        }
        
        return answer;
    }
}
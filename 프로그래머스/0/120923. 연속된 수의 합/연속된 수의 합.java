class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        
        answer = new int[num];
        
        int share = (int) (total / num);
        
        for (int i = 0; i < num; i++){
            if(i == 0){
                answer[i] = (share - (int) (num - 1)/2);
            }
            else {
                answer[i] = (answer[i-1] + 1);
            }
        }
        
        return answer;
    }
}
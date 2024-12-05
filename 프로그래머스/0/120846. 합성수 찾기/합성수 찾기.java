class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<= n; i++){
            int check = 0;
            for(int j = 1; j * j <= i; j++){
                if(j * j == i) check++;
                else if(i % j == 0) check = check + 2;
            }
            if(check >= 3) answer++;
        }
        return answer;
    }
}
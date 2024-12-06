class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 1){
            int num = n;
            int check = 0;
            for(int i = 1; i * i <= num; i++){
                if(i * i == num) check++;
                else if(num % i == 0) check += 2;
                if(check > 2) break;
            }
            if(check == 2) answer++;
            n--;
        }
        return answer;
    }
}
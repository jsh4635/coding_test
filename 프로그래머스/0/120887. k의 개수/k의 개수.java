class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <= j; a++){
            int n = a;
            while(n > 0){
                if(n % 10 == k) answer++;
                n = n / 10;
            }
        }
        return answer;
    }
}
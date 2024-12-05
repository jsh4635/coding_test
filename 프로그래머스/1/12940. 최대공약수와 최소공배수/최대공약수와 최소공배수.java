class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        
        int a = 1;
        for(int i = 1; i * i <= n * m; i++){
            if(n * m % i == 0 && answer[0] == i) {
                answer[1] = (int) n * m / i;
                return answer;
            }
        }
        
        return answer;
    }
    
    int gcd(int a, int b){
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }
}
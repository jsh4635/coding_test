class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(check(i, n)) answer++;
        }
        
        return answer;
    }
    
    public boolean check(int k, int n){
        int s = 0;
        for(int i = k; i <= n; i++){
            s += i;
            if(s == n) return true;
            else if(s > n) return false;
        }
        return true;
    }
}
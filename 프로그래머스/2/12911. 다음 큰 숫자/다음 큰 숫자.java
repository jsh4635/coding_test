class Solution {
    public int solution(int n) {
        int nOne = checkOne(n);
        int bigOne = 0;
        int big = n;
        while(nOne != bigOne){
            big++;
            bigOne = checkOne(big);
        }
        
        return big;
    }
    
    public int checkOne(int n){
        int sum = 0;
        while(n > 0){
            if(n % 2 == 1) sum++;
            n /= 2;
        }
        
        return sum;
    }
}
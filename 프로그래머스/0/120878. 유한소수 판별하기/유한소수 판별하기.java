class Solution {
    public int solution(int a, int b) {
        b /= gcd(a, b);
        
        if(isTwoAndFive(b)){
            return 1;
        }
        
        return 2;
    }
    
    int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    boolean isTwoAndFive(int n){
        
        while(n > 1){
            for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    n /= i;
                    if(i != 2 && i != 5){
                        return false;
                    }
                    break;
                }
            }
        }
        
        return true;
    }
}
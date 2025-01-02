class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer();
        
        while(n > 0){
            sb.append(n % k);
            n /= k;
        }
        
        String[] sArr = sb.reverse().toString().split("0");
        
        for(String s : sArr){
            if(checkPN(s)) answer++;
        }
        
        return answer;
    }
    
    public boolean checkPN(String s){
        if(s.isEmpty() || s.equals("1")) return false;
        long num = Long.parseLong(s);
        for(long i = 2; i * i <= num; i++){
            if(i * i == num) return false;
            else if(num % i == 0) return false;
        }
        return true;
    }
}
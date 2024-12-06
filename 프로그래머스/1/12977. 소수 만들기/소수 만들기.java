class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            int n = nums[i];
            for(int j = i + 1; j < nums.length - 1; j++){
                n += nums[j];
                for(int k = j + 1; k < nums.length; k++){
                    n += nums[k];
                    if(check(n)) answer++;
                    n = nums[i] + nums[j];
                }
                n = nums[i];
            }
        }

        return answer;
    }
    
    boolean check(int n){
        int check = 0;
        for(int i = 1; i * i <= n; i++){
            if(i * i == n) return false;
            else if(n % i == 0) check += 2;
        }
        if(check > 2) return false;
        return true;
    }
}
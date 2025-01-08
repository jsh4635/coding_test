class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i < 3) arr[i] = i % 1000000007;
            else arr[i] = (arr[i - 2] + arr[i - 1]) % 1000000007;
        }
        
        return arr[n];
    }
}
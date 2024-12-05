class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int a = 1;
        
        int i = 0;
        int j = 0;
        
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        
        int check = 0;
        
        while(a <= n * n){
            if(i < n && j < n && i >= 0 && j >= 0 && answer[j][i] == 0){
                answer[j][i] = a++;
            }
            else {
                i -= x[check];
                j -= y[check];
                check = (check + 1) % 4;
            }
            
            i += x[check];
            j += y[check];
        }
        
        return answer;
    }
}
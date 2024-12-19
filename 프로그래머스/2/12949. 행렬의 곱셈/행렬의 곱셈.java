class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int y = arr1.length;
        int x = arr2[0].length;
        int[][] answer = new int[y][x];
        
        for(int j = 0; j < y; j++){
            for(int i = 0; i < x; i++){
                answer[j][i] = sumArr1AndArr2(arr1, arr2, i, j);
            }
        }
        
        return answer;
    }
    
    public int sumArr1AndArr2(int[][] arr1, int[][] arr2, int x, int y){
        int sum = 0;
        
        for(int i = 0; i < arr1[y].length; i++){
            sum += arr1[y][i] * arr2[i][x];
        }
        
        
        return sum;
    }
}
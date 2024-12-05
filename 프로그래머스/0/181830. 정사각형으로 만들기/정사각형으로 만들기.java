class Solution {
    public int[][] solution(int[][] arr) {
        int size = arr.length > arr[0].length ? arr.length : arr.length == arr[0].length ? arr.length : arr[0].length;
        
        int[][] answer = new int[size][size];
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i < arr.length && j < arr[i].length) answer[i][j] = arr[i][j];
                else answer[i][j] = 0;
            }
        }
        
        
        
        return answer;
    }
}
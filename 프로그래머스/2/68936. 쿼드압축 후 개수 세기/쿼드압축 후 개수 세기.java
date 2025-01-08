class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        int size = arr.length;
        int num = size;
        
        if(size == 1){
            answer[0] = arr[0][0] == 0 ? 1 : 0;
            answer[1] = arr[0][0] == 1 ? 1 : 0;
        }
        
        while(num > 1){
            for(int i = 0; i < size; i += num){
                for(int j = 0; j < size; j += num){
                    if(arr[i][j] > 1) {
                        j += num;
                        continue;
                    }
                    if(check(arr, i, j, num)) {
                        for(int k = i; k < i + num; k++){
                            arr[k][j] = num;
                        }
                    }
                }
            }
            num /= 2;
        }
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(arr[i][j] > 1){
                    if(arr[i][j + 1] == 0 && i % arr[i][j] == 0) answer[0]++;
                    else if(arr[i][j + 1] == 1 && i % arr[i][j] == 0) answer[1]++;
                    j += arr[i][j] - 1;
                }else{
                    if(arr[i][j] == 0) answer[0]++;
                    else if(arr[i][j] == 1) answer[1]++;
                }
            }
        }
        
        return answer;
    }
    
    public boolean check(int[][] arr, int x, int y, int size){
        int num = -1;
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(num == -1) num = arr[i][j];
                else if(num != arr[i][j]) return false;
            }
        }
        return true;
    }
    
}
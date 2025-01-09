class Solution {
    public int[] solution(int n) {
        int[][] board = new int[n][n];
        
        int x = 0;
        int y = 0;
        
        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        
        int check = 0;
        
        int num = 1;
        int idx = n;
        
        while(idx > 0){
            if(0 > x || x >= n || 0 > y || y >= n || board[x][y] != 0){
                x -= dx[check % 3];
                y -= dy[check % 3];
                check++;
                idx--;
                num--;
            }
            board[x][y] = num++;
            x += dx[check % 3];
            y += dy[check % 3];
        }
        
        int[] answer = new int[num - 1];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0) break;
                answer[idx++] = board[i][j];
            }
        }
        
        return answer;
    }
}
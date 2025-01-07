class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] cboard = new char[m][n];
        
        for(int i = 0; i < m; i++){
            cboard[i] = board[m - 1 - i].toCharArray();
        }
        
        while(true){
            boolean check = true;
            boolean[][] visited = new boolean[m][n];
            
            for(int i = 0; i < m - 1; i++){
                for(int j = 0; j < n - 1; j++){
                    char a = cboard[i][j];
                    char b = cboard[i][j + 1];
                    char c = cboard[i + 1][j];
                    char d = cboard[i + 1][j + 1];
                    if(a == '0' || b == '0' || c == '0' || d == '0') continue;
                    if(a == b && b == c && c == d){
                        if(!visited[i][j]){
                            visited[i][j] = true;
                            answer++;
                        }
                        if(!visited[i][j + 1]){
                            visited[i][j + 1] = true;
                            answer++;
                        }
                        if(!visited[i + 1][j]){
                            visited[i + 1][j] = true;
                            answer++;
                        }
                        if(!visited[i + 1][j + 1]){
                            visited[i + 1][j + 1] = true;
                            answer++;
                        }
                        check = false;
                    }
                }
            }
            
            if(check) break;
            
            for(int i = 0; i < m - 1; i++){
                for(int j = 0; j < n; j++){
                    if(visited[i][j]){
                        boolean none = true;
                        for(int k = i + 1; k < m; k++){
                            if(cboard[k][j] != '0' && !visited[k][j]){
                                cboard[i][j] = cboard[k][j];
                                cboard[k][j] = '0';
                                none = false;
                                visited[k][j] = true;
                                break;
                            }
                        }
                        if(none) cboard[i][j] = '0';
                    }
                }
            }
        }
        
        return answer;
    }
}
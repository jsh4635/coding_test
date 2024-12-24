class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        
        boolean[] visited = new boolean[dungeons.length];
        
        return dfs(k, dungeons, visited, 0, 0, answer);
    }
    
    public int dfs(int k, int[][] dungeons, boolean[] visited, int idx, int count, int max){
        if(idx == dungeons.length) {
            return Math.max(max, count);
        }
        
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            
            if(dungeons[i][0] <= k) max = dfs(k - dungeons[i][1], dungeons, visited, idx + 1, count + 1, max);
            else max = dfs(k, dungeons, visited, idx + 1, count, max);
            
            visited[i] = false;
        }
        
        return max;
    }
}
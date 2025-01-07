import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<Value> q = new LinkedList<>();
        boolean[] visited = new boolean[y - x + 1];
        q.offer(new Value(x, 0));
        visited[0] = true;
        
        while(!q.isEmpty()){
            Value v = q.poll();
            if(v.x == y) return v.count;
            
            if(v.x + n <= y && !visited[v.x + n - x]) {
                q.offer(new Value(v.x + n, v.count + 1));
                visited[v.x + n - x] = true;
            }
            if(v.x * 2 <= y && !visited[v.x * 2 - x]) {
                q.offer(new Value(v.x * 2, v.count + 1));
                visited[v.x * 2 - x] = true;
            }
            if(v.x * 3 <= y && !visited[v.x * 3 - x]) {
                q.offer(new Value(v.x * 3, v.count + 1));
                visited[v.x * 3 - x] = true;
            }
        }
        
        return -1;
    }
    
    class Value{
        int x;
        int count;
        Value(int x, int count){
            this.x = x;
            this.count = count;
        }
    }
}
import java.util.*;

class Solution {
    class Value{
        int x;
        int count;
        Value(int x, int count){
            this.x = x;
            this.count = count;
        }
    }
    
    public int solution(int x, int y, int n) {
        boolean[] visited = new boolean[y - x + 1];
        
        Queue<Value> q = new LinkedList<>();
        q.offer(new Value(x, 0));
        
        while(!q.isEmpty()){
            Value v = q.poll();
            
            if(v.x == y) return v.count;
            
            if(v.x + n <= y && !visited[v.x + n - x]){
                visited[v.x + n - x] = true;
                q.offer(new Value(v.x + n, v.count + 1));
            }
            if(v.x * 2 <= y && !visited[v.x * 2 - x]){
                visited[v.x * 2 - x] = true;
                q.offer(new Value(v.x * 2, v.count + 1));
            }
            if(v.x * 3 <= y && !visited[v.x * 3 - x]){
                visited[v.x * 3 - x] = true;
                q.offer(new Value(v.x * 3, v.count + 1));
            }
        }
        
        return -1;
    }
}
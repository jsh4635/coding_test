import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        
        for(int i : truck_weights){
            q1.offer(i);
        }
        
        Queue<Value> q = new LinkedList<>();
        
        int total = 0;
        int time = 0;
        
        while(!q1.isEmpty()){
            time++;
            int num = q1.peek();
            if(q.isEmpty()){
                q.offer(new Value(num, time, time + bridge_length - 1));
                total += num;
                q1.poll();
            }else {
                while(!q.isEmpty()){
                    Value v = q.peek();
                    if(time <= v.e) break;
                    else if(time > v.e) {
                        q.poll();
                        total -= v.weight;
                    }
                }
                if(total + num <= weight){
                    q.offer(new Value(num, time, time + bridge_length - 1));
                    total += num;
                    q1.poll();
                } 
            }   
        }
        
        while(!q.isEmpty()){
            Value v = q.poll();
            answer = v.e + 1;
        }
        
        return answer;
    }
    
    class Value{
        int weight;
        int s;
        int e;
        Value(int weight, int s, int e){
            this.weight = weight;
            this.s = s;
            this.e = e;
        }
        
        public String toString(){
            return "weight: " + weight + ", s: " + s + ", e: " + e;
        }
    }
}
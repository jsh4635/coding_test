import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        
        Map<String, User> users = new HashMap<>();
        
        List<String> enterAndLeave = new ArrayList<>();
        
        for(String s : record){
            String[] sArr = s.split("\\s+");
            String op = sArr[0];
            String id = sArr[1];
            String name = sArr.length > 2 ? sArr[2] : "";
            
            User user = users.getOrDefault(id, new User());
            if(!name.isEmpty()) user.change(name);
            users.put(id, user);
            enterAndLeave.add(op + " " + id);
        }
        
        for(String s : enterAndLeave){
            String op = s.split("\\s+")[0];
            String id = s.split("\\s+")[1];
            
            User user = users.get(id);
            if(op.equals("Enter")) answer.add(user.enter());
            else if(op.equals("Leave")) answer.add(user.leave());
        }
        
        return answer.toArray(new String[answer.size()]);
    }
    
    class User{
        String userName;
        
        public String enter(){
            return this.userName + "님이 들어왔습니다.";
        }
        
        public String leave(){
            return this.userName + "님이 나갔습니다.";
        }
        
        public void change(String userName){
            this.userName = userName;
        }
    }
}
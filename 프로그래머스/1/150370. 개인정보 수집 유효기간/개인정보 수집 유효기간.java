import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        
        List<Integer> list = new ArrayList<>();
        
        String[] todayArr = today.split("[.]");
        
        for(String s : terms){
            String[] sArr = s.split("\\s+");
            
            map.put(sArr[0], Integer.parseInt(sArr[1]));
        }
        
        int i = 1;
        
        for(String s : privacies){
            int year = Integer.parseInt(s.split("\\s+")[0].split("[.]")[0]);
            int month = Integer.parseInt(s.split("\\s+")[0].split("[.]")[1]);
            int day = Integer.parseInt(s.split("\\s+")[0].split("[.]")[2]);
            
            int x = map.get(s.split("\\s+")[1]);
            
            month += x;
            day -= 1;
            if(day == 0){
                month -= 1;
                day = 28;
            }
            while(month > 12){
                year += 1;
                month -= 12;
            }
            if(month == 0){
                year -= 1;
                month = 12;
            }
            
            if(Integer.parseInt(todayArr[0]) - year > 0) list.add(i);
            else if(Integer.parseInt(todayArr[0]) == year){
                if(Integer.parseInt(todayArr[1]) - month > 0) list.add(i);
                else if(Integer.parseInt(todayArr[1]) == month){
                    if(Integer.parseInt(todayArr[2]) - day > 0) list.add(i);
                }
            }
            
            i++;
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
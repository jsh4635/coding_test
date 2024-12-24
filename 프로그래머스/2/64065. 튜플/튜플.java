import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        
        String s1 = s.substring(1, s.length() - 1);
        
        String[] sArr = s1.split("},");
        
        List<List<Integer>> bList = new ArrayList<>();
        
        for(String s2 : sArr){
            s2 = s2.replace("{","").replace("}","");
            bList.add(makeList(s2));
        }
        
        Collections.sort(bList, new Comparator<List<Integer>>(){
            public int compare(List<Integer> o1, List<Integer> o2){
                return o1.size() - o2.size();
            }
        });
        
        for(List<Integer> l : bList){
            for(int i = 0; i < l.size(); i++){
                if(!list.contains(l.get(i))) list.add(l.get(i));
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public List<Integer> makeList(String s){
        List<Integer> newList = new ArrayList<>();
        
        String[] sArr = s.split(",");
        
        for(String s1 : sArr){
            newList.add(Integer.parseInt(s1));
        }
        
        return newList;
    }
}
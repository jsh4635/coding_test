import java.util.*;

class Solution {
    List<String> wordList = new ArrayList<>();
    public int[] solution(String msg) {
        List<Integer> indexList = new ArrayList<>();
        init();
        int s = 0;
        int e = 1;
        
        String str = msg.substring(s, e);
        
        int idx = 0;
        
        while(e <= msg.length()){
            int tmp = wordList.indexOf(str);
            if(tmp == -1){
                wordList.add(str);
                s = e - 1;
                indexList.add(idx);
            }
            else {
                e++;
                idx = tmp;
            }
            if(e > msg.length()){
                e--;
            }
            if(e == msg.length()){
                str = msg.substring(s, e);
                tmp = wordList.indexOf(str);
                if(tmp != -1) indexList.add(tmp);
                else {
                    indexList.add(idx);
                    str = msg.substring(e - 1, e);
                    tmp = wordList.indexOf(str);
                    indexList.add(tmp);
                }
                break;
            }
            str = msg.substring(s, e);
        }
        
        return indexList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public void init(){
        char c = 65;
        wordList.add("");
        
        for(int i = 0; i < 26; i++){
            wordList.add(c + "");
            c += 1;
        }
    }
}
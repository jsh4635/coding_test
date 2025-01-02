import java.util.*;

class Solution {
    String[] str = {"A", "E", "I", "O", "U"};
    List<String> wordList = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        dfs("");
        
        return wordList.indexOf(word);
    }
    
    public void dfs(String word){
        wordList.add(word);
        
        if(word.length() == 5) return;
        
        for(String s : str){
            dfs(word + s);
        }
    }
}
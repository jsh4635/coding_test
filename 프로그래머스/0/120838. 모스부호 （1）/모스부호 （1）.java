import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, String> morseMap = new HashMap<String, String>();
        
        for(int i = 0; i < morse.length; i++){
            morseMap.put(morse[i], String.valueOf((char)(i + 97)));
        }
        
        String[] message = letter.split("\\s");
        
        for(int i = 0; i < message.length; i++){
            answer += morseMap.get(message[i]);
        }
        
        return answer;
    }
}
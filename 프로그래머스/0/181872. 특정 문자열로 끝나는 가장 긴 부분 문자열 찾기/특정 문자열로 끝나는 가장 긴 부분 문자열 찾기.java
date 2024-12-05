class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int index = 0;
        
        for(int i = 0; i < myString.length() - pat.length() + 1; i++){
            if(pat.equals(myString.substring(i, i + pat.length()))) index = i + pat.length();
        }
        
        answer = myString.substring(0, index);
        
        return answer;
    }
}
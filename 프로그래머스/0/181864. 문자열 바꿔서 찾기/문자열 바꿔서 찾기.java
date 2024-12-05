class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String s = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A') s += "B";
            else if(myString.charAt(i) == 'B') s += "A";
        }
        
        return s.contains(pat) ? 1 : 0;
    }
}
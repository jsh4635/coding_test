class Solution {
    boolean solution(String s) {
        int check = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') check++;
            else if(s.charAt(i) == ')' && check > 0) check--;
            else if(s.charAt(i) == ')' && check == 0) return false;
        }
        
        if(check > 0) return false;

        return true;
    }
}
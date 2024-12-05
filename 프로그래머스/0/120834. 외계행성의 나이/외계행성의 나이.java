class Solution {
    public String solution(int age) {
        StringBuffer s = new StringBuffer();
        
        while(age > 0){
            int n = age % 10 + 97;
            char c = Character.valueOf((char)n);
            
            s.append(c);
            age /= 10;
        }
        
        return s.reverse().toString();
    }
}
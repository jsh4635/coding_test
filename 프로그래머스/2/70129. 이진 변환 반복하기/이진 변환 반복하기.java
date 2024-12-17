class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int length = s.length();
        
        while(!s.equals("1")){
            answer[0]++;
            s = s.replaceAll("0", "");
            answer[1] += length - s.length();
            s = makeString(s.length());
            length = s.length();
        }
        
        
        return answer;
    }
    
    public String makeString(int num){
        StringBuffer sb = new StringBuffer();
        
        while(num > 0){
            sb.append(num % 2);
            num /= 2;
        }
        
        return sb.reverse().toString();
    }
}
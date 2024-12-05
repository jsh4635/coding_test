class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++){
            if(Integer.valueOf(my_string.charAt(i)) < 97) answer[Integer.valueOf(my_string.charAt(i)) - 65]++;
            else if(Integer.valueOf(my_string.charAt(i)) >= 97) answer[Integer.valueOf(my_string.charAt(i)) - 71]++;
        }
        
        return answer;
    }
}
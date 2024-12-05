class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < picture.length; i++){
            String s = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int x = 0; x < k; x ++){
                    s += String.valueOf(picture[i].charAt(j));
                }
            }
            
            for(int j = 0; j < k; j++){
                answer[j + (i * k)] = s;
            }
        }
        
        return answer;
    }
}
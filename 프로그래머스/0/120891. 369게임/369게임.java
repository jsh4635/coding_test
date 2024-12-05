class Solution {
    public int solution(int order) {
        int answer = 0;
        String numbers = String.valueOf(order);
        
        for(int i = 0; i < numbers.length(); i++){
            if(String.valueOf(numbers.charAt(i)).equals("3") || String.valueOf(numbers.charAt(i)).equals("6") || String.valueOf(numbers.charAt(i)).equals("9")) answer++;
        }
        
        return answer;
    }
}
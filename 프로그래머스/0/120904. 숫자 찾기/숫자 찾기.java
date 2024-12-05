class Solution {
    public int solution(int num, int k) {
        String numbers = String.valueOf(num);
        for(int i = 0; i < numbers.length(); i++){
            if(Integer.valueOf(String.valueOf(numbers.charAt(i))) == k){
                return i + 1;
            }
        }
        return -1;
    }
}
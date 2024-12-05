class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        
        for(int i = 1; i < k; i++){
            index += 2;
            if(index == numbers.length) index = 0;
            else if(index == numbers.length + 1) index = 1;
        }
        
        return numbers[index];
    }
}
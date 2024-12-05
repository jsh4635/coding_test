import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int length = numbers.length;
        
        Arrays.sort(numbers);
        
        if(numbers[length - 1] * numbers[length - 2] < numbers[0] * numbers[1]) answer = numbers[0] * numbers[1];
        else answer = numbers[length - 1] * numbers[length - 2];
        
        return answer;
    }
}
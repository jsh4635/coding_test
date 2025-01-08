class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            long num = numbers[i];
            
            if((1L & num) == 0 || (2L & num) == 0){
                answer[i] = num + 1;
                continue;
            }
            
            int idx = 2;
            
            while(((1L << idx) & num) != 0) idx++;
            
            answer[i] = (num | (1L << idx)) - (1L << (idx - 1));
            
        }
        
        return answer;
    }
}
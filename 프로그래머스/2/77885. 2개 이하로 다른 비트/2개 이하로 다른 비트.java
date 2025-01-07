class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        // 반복문 순환
        for(int i = 0; i < numbers.length; i++){
            // 비교할 숫자 생성
            long num = numbers[i];

            // 비트 연산 시작
            // 1, 2일 경우 비트가 바로 다음 숫자이다.
            if((num & 1L) == 0 || (num & 2L) == 0){
                answer[i] = num + 1;
                continue;
            }

            // 3 이상일 경우
            int idx = 2;
            
            // 비트 & 연산으로 전부 다 다를때까지 반복
            while(((1L << idx) & num) != 0) idx++;
            
            
            answer[i] = (num | (1L << idx)) - (1L << (idx - 1));
        }

        return answer;
    }
}
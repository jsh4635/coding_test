import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        List<String> babblingList = Arrays.asList(babbling);
        answer = (int) babblingList.stream()
            .filter(e -> {
            return e.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$");
        }).count();
        
        return answer;
    }
}
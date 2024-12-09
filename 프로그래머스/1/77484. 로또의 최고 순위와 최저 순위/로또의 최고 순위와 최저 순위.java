import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        List<Integer> lottoList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> numList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        
        int zero = Collections.frequency(lottoList, 0);
        
        int check = (int)lottoList.stream().filter(e -> Collections.frequency(numList, e) > 0).count();
        
        switch (check){
            case 6: {
                answer[0] = answer[1] = 1;
                break;
            }
            case 5: {
                answer[0] = answer[1] = 2;
                break;
            }
            case 4: {
                answer[0] = answer[1] = 3;
                break;
            }
            case 3: {
                answer[0] = answer[1] = 4;
                break;
            }
            case 2: {
                answer[0] = answer[1] = 5;
                break;
            }
            default: {
                answer[0] = answer[1] = 6;
                break;
            }
        }
        
        answer[0] = answer[0] - zero > 1 ? answer[0] - zero : 1;
        
        return answer;
    }
}
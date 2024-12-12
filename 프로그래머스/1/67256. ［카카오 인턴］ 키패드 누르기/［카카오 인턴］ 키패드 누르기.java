import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        List<Integer> lNumber = List.of(1, 4, 7, -1);
        List<Integer> rNumber = List.of(3, 6, 9, -1);
        List<Integer> mNumber = List.of(2, 5, 8, 0);
        
        String lHand = "*";
        String rHand = "#";
        
        for(int i : numbers){
            if(lNumber.contains(i)) {
                lHand = String.valueOf(i);
                answer += "L";
            }
            else if(rNumber.contains(i)) {
                rHand = String.valueOf(i);
                answer += "R";
            }
            else {
                if(lHand.equals("*")) lHand = "-1";
                if(rHand.equals("#")) rHand = "-1";
                int lIdx = -1;
                int rIdx = -1;
                boolean isLeftMiddle = false;
                boolean isRightMiddle = false;
                    
                int iIdx = mNumber.indexOf(i);
                    
                if(lNumber.contains(Integer.parseInt(lHand))){
                    lIdx = lNumber.indexOf(Integer.parseInt(lHand));
                }else {
                    lIdx = mNumber.indexOf(Integer.parseInt(lHand));
                    isLeftMiddle = true;
                }
                    
                if(rNumber.contains(Integer.parseInt(rHand))){
                    rIdx = rNumber.indexOf(Integer.parseInt(rHand));
                }else {
                    rIdx = mNumber.indexOf(Integer.parseInt(rHand));
                    isRightMiddle = true;
                }
                
                int lMove = isLeftMiddle ? Math.abs(iIdx - lIdx) : Math.abs(iIdx - lIdx) + 1;
                int rMove = isRightMiddle ? Math.abs(iIdx - rIdx) : Math.abs(iIdx - rIdx) + 1;
                
                if(lMove < rMove){
                    lHand = String.valueOf(i);
                    answer += "L";
                }else if(lMove > rMove){
                    rHand = String.valueOf(i);
                    answer += "R";
                }else {
                    if(hand.equals("left")) {
                        lHand = String.valueOf(i);
                        answer += "L";
                    }
                    if(hand.equals("right")) {
                        rHand = String.valueOf(i);
                        answer += "R";
                    }
                }    
            }
        }
        
        return answer;
    }
}
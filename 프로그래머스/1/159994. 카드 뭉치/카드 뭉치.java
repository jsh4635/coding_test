class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int gIdx = 0;
        int cIdx1 = 0;
        int cIdx2 = 0;
        
        while(gIdx < goal.length){
            if(cIdx1 < cards1.length && goal[gIdx].equals(cards1[cIdx1])) cIdx1++;
            else if(cIdx2 < cards2.length && goal[gIdx].equals(cards2[cIdx2])) cIdx2++;
            else return "No";
            gIdx++;
        }
        
        return "Yes";
    }
}
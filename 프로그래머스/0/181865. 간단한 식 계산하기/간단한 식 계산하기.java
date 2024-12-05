class Solution {
    public int solution(String binomial) {
        String[] sArr = binomial.split("\\s");
        if(sArr[1].equals("+")) return Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[2]);
        else if(sArr[1].equals("-")) return Integer.parseInt(sArr[0]) - Integer.parseInt(sArr[2]);
        else return Integer.parseInt(sArr[0]) * Integer.parseInt(sArr[2]);
    }
}
class Solution {
    public int solution(String number) {
        int n = 0;
        String[] nArr = number.split("");
        for(String s : nArr){
            n += Integer.parseInt(s);
        }
        return n % 9;
    }
}
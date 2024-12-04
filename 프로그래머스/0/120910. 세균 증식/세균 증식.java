class Solution {
    public int solution(int n, int t) {
        int time = (int)Math.pow(2, t);
        return time * n;
    }
}
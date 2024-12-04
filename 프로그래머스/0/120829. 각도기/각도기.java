class Solution {
    public int solution(int angle) {
        return 0 < angle && angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
    }
}
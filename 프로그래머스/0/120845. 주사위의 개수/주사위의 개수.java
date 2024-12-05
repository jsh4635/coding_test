class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int size1 = box[0] / n;
        int size2 = box[1] / n;
        int size3 = box[2] / n;
        
        return size1 * size2 * size3;
    }
}
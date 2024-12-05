class Solution {
    public int solution(int[][] dots) {
        if(a(dots[0], dots[1]) == a(dots[2], dots[3])) return 1;
        else if(a(dots[0], dots[2]) == a(dots[1], dots[3])) return 1;
        else if(a(dots[0], dots[3]) == a(dots[1], dots[2])) return 1;
        
        return 0;
    }
    
    public double a(int[] arr1, int[] arr2){
        return (arr2[1] - arr1[1]) * 1.0 / (arr2[0] - arr1[0]);
    }
}
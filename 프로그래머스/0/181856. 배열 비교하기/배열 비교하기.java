import java.util.*;


class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length){
            int num1 = Arrays.stream(arr1).sum();
            int num2 = Arrays.stream(arr2).sum();
            return num1 > num2 ? 1 : num1 == num2 ? 0 : -1;
        } 
        else if(arr1.length > arr2.length) return 1;
        else return -1;
    }
}
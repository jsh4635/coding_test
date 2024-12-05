class Solution {
    public int solution(int[] array, int n) {
        int index = 0;
        int value = n - array[0] < 0 ? array[0] - n : n - array[0];
        int tmp = 0;
        for(int i = 1; i < array.length; i++){
            tmp = n - array[i] < 0 ? array[i] - n : n - array[i];
            if(tmp < value){
                index = i;
                value = tmp;
            }else if(tmp == value){
                if(array[i] < array[index])index = i;
            }
        }
        
        return array[index];
    }
}
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] size = new int[n];
        for(int i = 0; i < section.length; i++){
            size[section[i] - 1] = 1;
        }
        
        for(int i = 0; i < n; i++){
            if(size[i] == 1){
                for(int j = i; j < (i + m < n ? i + m : n); j++){
                    size[j] = 0;
                }
                i += m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}
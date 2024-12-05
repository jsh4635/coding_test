class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split("\\s");
        
        String value = "";
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("Z")) answer -= Integer.parseInt(value);
            else {
                value = arr[i];
                answer += Integer.parseInt(value);
            }
        }
        
        return answer;
    }
}
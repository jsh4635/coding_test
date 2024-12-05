class Solution {
    public int solution(int[] num_list) {
        String n1 = "";
        String n2 = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0) n1 += num_list[i];
            else n2 += num_list[i];
        }
        return Integer.parseInt(n1) + Integer.parseInt(n2);
    }
}
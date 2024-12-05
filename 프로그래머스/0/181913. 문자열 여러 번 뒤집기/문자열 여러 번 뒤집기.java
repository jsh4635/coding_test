class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] i : queries){
            int s = i[0];
            int e = i[1] + 1;
            StringBuffer str = new StringBuffer(my_string.substring(s, e)).reverse();
            my_string = my_string.substring(0, s) + str.toString() + my_string.substring(e);
        }
                
        return my_string;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String numReg = "[0-9]";
        String notNumReg = "[^0-9]+\\s*";
        
        Arrays.sort(files, new Comparator<String>(){
            public int compare(String s1, String s2){
                String h1 = s1.split(numReg)[0];
                String h2 = s2.split(numReg)[0];
                String h1n = s1.split(notNumReg)[1];
                String h2n = s2.split(notNumReg)[1];
                
                if(h1n.length() > 5) h1n = h1n.substring(0, 5);
                if(h2n.length() > 5) h2n = h2n.substring(0, 5);
                
                if(h1.equalsIgnoreCase(h2)){
                    int n1 = Integer.parseInt(h1n);
                    int n2 = Integer.parseInt(h2n);
                    return n1 - n2;
                }
                else {
                    return h1.compareToIgnoreCase(h2);
                }
            }
        });
        
        return files;
    }
}
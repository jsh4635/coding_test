import java.util.*;

class Solution {
    public int solution(String numbers) {
        List<Integer> idxs = new ArrayList<>();
        
        String[] nArr = numbers.split("");
        Set<Integer> checkNum = new HashSet<>();
        return dfs(nArr, "", idxs, 0, checkNum);
    }
    
    public int dfs(String[] numbers, String number, List<Integer> idx, int count, Set<Integer> checkNum){
        if(check(number, checkNum)) count++;
        if(number.length() == numbers.length) return count;
        
        for(int i = 0; i < numbers.length; i++){
            if(idx.contains(i)) continue;
            List<Integer> idxs = new ArrayList<>(idx);
            idxs.add(i);
            count = dfs(numbers, number + numbers[i], idxs, count, checkNum);
        }
        return count;
    }
    
    public boolean check(String number, Set<Integer> checkNum){
        if(number.isEmpty()) return false;
        int num = Integer.parseInt(number);
        if(num < 2 || checkNum.contains(num)) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        checkNum.add(num);
        return true;
    }
}
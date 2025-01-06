class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String reg = "[^" + skill + "]";
        
        for(String s : skill_trees){
            s = s.replaceAll(reg, "");
            if(skill.startsWith(s)) answer++;
        }
        
        return answer;
    }
}
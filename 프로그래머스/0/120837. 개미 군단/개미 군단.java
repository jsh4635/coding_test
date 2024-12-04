class Solution {
    public int solution(int hp) {
        int gen = hp / 5;
        int sol = (hp - (gen * 5)) / 3;
        int wor = (hp - (gen * 5) - (sol * 3));
        
        return gen + sol + wor;
    }
}
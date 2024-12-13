class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int lastAttack = attacks[attacks.length - 1][0];
        
        int check = 0;
        int idx = 0;
        
        int maxHealth = health;
        
        for(int i = 1; i <= lastAttack; i++){
            if(i == attacks[idx][0]){
                health -= attacks[idx][1];
                if(health <= 0) return -1;
                idx++;
                check = 0;
            }else {
                if(health < maxHealth){
                    check++;
                    if(check != bandage[0]){
                        health = health + bandage[1] >= maxHealth ? maxHealth : health + bandage[1];
                    }else if(check == bandage[0]){
                        health = health + bandage[1] + bandage[2] >= maxHealth ? maxHealth : health + bandage[1] + bandage[2];
                        check = 0;
                    }   
                }
            }
        }
        
        return health;
    }
}
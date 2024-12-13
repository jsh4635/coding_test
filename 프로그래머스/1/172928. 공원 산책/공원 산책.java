class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int x = 0;
        int y = 0;
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int xLength = park[0].length();
        int yLength = park.length;
        
        for(int j = 0; j < park.length; j++){
            String s = park[j];
            if(s.contains("S")){
                y = j;
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == 'S') x = i;
                }
            }
        }
        
        int idx = 0;
        
        for(String s : routes){
            String move = s.split("\\s+")[0];
            int length = Integer.parseInt(s.split("\\s+")[1]);
            if(move.equals("E")) idx = 0;
            else if(move.equals("S")) idx = 1;
            else if(move.equals("W")) idx = 2;
            else if(move.equals("N")) idx = 3;
            if(xLength <= x + (dx[idx] * length) || yLength <= y + (dy[idx] * length) || x + (dx[idx] * length) < 0 || y + (dy[idx] * length) < 0) continue;
            else {
                boolean check = true;
                for(int i = 1; i <= length; i++){
                    if(park[y + (dy[idx] * i)].charAt(x + (dx[idx] * i)) == 'X') {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    x += dx[idx] * length;
                    y += dy[idx] * length;
                }
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}
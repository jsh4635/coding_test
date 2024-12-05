class Solution {
    public int solution(int a, int b, int c) {
        if(a == b && b == c) return (3 * a) * (3 * (int)Math.pow(a, 2)) * (3 * (int)Math.pow(a, 3));
        else if(a != b && b != c && c != a) return a + b + c;
        else return (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2));
    }
}
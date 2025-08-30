class Solution {
    private int powResult(int a, int b, int c, int i){
        return (int) Math.pow(a, i) + (int) Math.pow(b, i) + (int) Math.pow(c, i);
    }
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && b!=c && c!=a){
            return powResult(a, b, c, 1);
        }else if(a==b && b==c && c==a){
            return powResult(a, b, c, 1)*powResult(a, b, c, 2)*powResult(a, b, c, 3);
        }else{
            return powResult(a, b, c, 1)*powResult(a, b, c, 2);
        }
    }
}
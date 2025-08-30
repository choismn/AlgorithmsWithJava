class Solution {
    public int solution(int n, String control) {
        char[] splited = control.toCharArray();
        for(char split : splited){
            if(split == 'w') n+=1;
            else if (split == 's') n-=1;
            else if (split == 'd') n += 10;
            else n-=10;
        }
        return n;
    }
}
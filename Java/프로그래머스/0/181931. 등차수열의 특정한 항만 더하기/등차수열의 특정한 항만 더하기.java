class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0 ; i<included.length ; i++){
            // 등차수열 계산해서 더하기
            if(included[i]) answer += a+d*i;;
        }
        return answer;
    }
}
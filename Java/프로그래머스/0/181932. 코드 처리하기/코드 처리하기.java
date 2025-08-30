class Solution {
    public String solution(String code) {
        int mode = 0;
        String answer = "";
        
        char[] splited = code.toCharArray();
        for(int i = 0 ; i<splited.length ; i++){
            if('1' == splited[i]){
                // mode 가 0이면 1로 바꿔주고 아니면 0으로 바꿔줌
                mode = (mode==0) ? 1 : 0;
                continue;
            }
            // mode 가 0이면 짝수일때만 answer에 더하기
            if(mode == 0 && i%2==0){
                answer += splited[i];
            }
            // mode 가 1이면 홀수일때만 answer에 더하기
            else if (mode == 1 && i%2 != 0){
                answer += splited[i];
            }
        }
        
        // answer이 빈 string이면 EMPTY로 변경
        if("".equals(answer)){
            answer = "EMPTY";
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<>();
        for(int i=l ; i<=r ; i++){
            String num = String.valueOf(i);
            boolean flag = false;
            for(char c : num.toCharArray()){
                if(c!= '5' && c!= '0') {
                    flag = true;
                    break;
                }
            }
            if(!flag) arr.add(i);
        }
        
        if(arr.isEmpty()){
            arr.add(-1);
        }
        
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
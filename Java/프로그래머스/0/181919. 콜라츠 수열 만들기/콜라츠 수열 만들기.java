import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(n);
        while(n!=1){
            n = (n%2==0) ? n/2 : 3*n+1;
            arr.add(n);
        }
        
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
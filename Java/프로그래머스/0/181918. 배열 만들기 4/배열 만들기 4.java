import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++){
            if(li.size() == 0){
                li.add(arr[i]);
            }else if(arr[i] > li.get(li.size()-1)){
                li.add(arr[i]);
            }else if(arr[i] <= li.get(li.size()-1)){
                li.remove(li.size()-1);
                i--;
            }
        }
        int[] stk = li.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}
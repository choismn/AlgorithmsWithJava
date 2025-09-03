class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int j=0 ; j<queries.length ; j++){
            int[] query = queries[j];
            int minValue = 10000001;
            for(int i=query[0] ; i<=query[1] ; i++){
                if(arr[i] > query[2] && minValue > arr[i]){
                    minValue = arr[i];
                }
            }
            if(minValue == 10000001)minValue=-1;
            answer[j] = minValue;
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s = 0;
        int e = 0;
        int k = 0;
        
        for(int j = 0; j < queries.length; j++){
            int[] query = queries[j];
            s = query[0];
            e = query[1];
            k = query[2];
            for(int i = s; i <= e; i++){
                if(i%k == 0){
                    arr[i] += 1;
                }
            }
        }
        
        return arr;
    }
}
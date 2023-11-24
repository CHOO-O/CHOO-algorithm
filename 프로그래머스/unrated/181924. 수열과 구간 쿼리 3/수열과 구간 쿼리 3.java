class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int[] query = queries[i];
            int idxi = query[0];
            int idxj = query[1];
            int temp = arr[idxi];
            
            arr[idxi] = arr[idxj];
            arr[idxj] = temp;
        }
        
        return arr;
    }
}
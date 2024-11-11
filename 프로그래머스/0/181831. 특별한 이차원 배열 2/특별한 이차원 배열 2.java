class Solution {
    public int solution(int[][] arr) {
    int n = arr.length;
    int cnt = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == arr[j][i]){
                    cnt ++;
                }
            }
        }
        
        if(cnt == (int)Math.pow(n,2)){
            return 1;
        } else {
            return 0;
        }   
    }
}
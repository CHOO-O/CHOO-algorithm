class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wmax = 0;
        int lmax = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]){
                if(sizes[i][0] > wmax){
                    wmax = sizes[i][0];
                }
                
                if(sizes[i][1] > lmax){
                    lmax = sizes[i][1];
                }
            } else {
                if(sizes[i][1] > wmax){
                    wmax = sizes[i][1];
                }
                
                if(sizes[i][0] > lmax){
                    lmax = sizes[i][0];
                }
            }
        }
        
        answer = wmax*lmax;
        
        return answer;
    }
}
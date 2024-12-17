class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xmin = dots[0][0];
        int xmax = dots[0][0];
        int ymin = dots[0][1]; 
        int ymax = dots[0][1];
        
        for(int i = 1; i < 4; i++){
            if(dots[i][0] < xmin){
                xmin = dots[i][0];
            } else if (dots[i][0] > xmax){
                xmax = dots[i][0];
            }
            
            if(dots[i][1] < ymin){
                ymin = dots[i][1];
            } else if (dots[i][1] > ymax){
                ymax = dots[i][1];
            }
        }
        
        answer = (xmax - xmin) * (ymax - ymin);
        
        return answer;
    }
}
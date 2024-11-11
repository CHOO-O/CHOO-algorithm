class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int row = 0;
        int col = 0;
        String direction = "r"; // r l u d
        
        for(int num = 1; num <= (int) Math.pow(n,2); num++){
            answer[row][col] = num;
            
            switch(direction){
                case "r":
                    if(col == n-1 || answer[row][col+1] != 0){
                        direction = "d";
                        row ++;
                        break;
                    }
                    col ++;
                    break;
                case "l":
                    if(col == 0 || answer[row][col-1] != 0){
                        direction = "u";
                        row --;
                        break;
                    }
                    col --;
                    break;
                case "u":
                    if(row == 0 || answer[row-1][col] != 0){
                        direction = "r";
                        col ++;
                        break;
                    }
                    row --;
                    break;
                case "d":
                    if(row == n-1 || answer[row+1][col] != 0){
                        direction = "l";
                        col --;
                        break;
                    }
                    row ++;
                    break;
            }
        }
        return answer;
    }
}
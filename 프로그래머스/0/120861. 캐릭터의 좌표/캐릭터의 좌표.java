class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        int xmax = (board[0] - 1)/2;
        int xmin = -(board[0] - 1)/2;
        int ymax = (board[1] - 1)/2;
        int ymin = -(board[1] - 1)/2;
 
        for(String k : keyinput){
            switch(k){
                case "up":
                    if(y < ymax){
                        y++;
                    }
                    break;
                case "down":
                    if(y > ymin){
                        y--;
                    }
                    break;
                case "left":
                    if(x > xmin){
                        x--;
                    }
                    break;
                case "right":
                    if(x < xmax){
                        x++;
                    }
                    break;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
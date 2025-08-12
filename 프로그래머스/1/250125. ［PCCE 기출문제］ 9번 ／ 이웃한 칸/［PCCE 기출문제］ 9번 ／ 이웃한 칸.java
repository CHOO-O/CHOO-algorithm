class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int garo = board.length;
        int sero = board[0].length;
        
        String color = board[h][w];
        
        // 위
        if(h-1 >= 0){
            if(board[h-1][w].equals(color)){
                answer++;
            }    
        }
        
        // 아래
        if(h+1 <= sero - 1){
            if(board[h+1][w].equals(color)){
                answer++;
            }
        }
        
        
        // 왼쪽
        if(w-1 >= 0){
            if(board[h][w-1].equals(color)){
                answer++;
            }    
        }
        
        
        // 오른쪽
        if(w+1 <= garo - 1){
            if(board[h][w+1].equals(color)){
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        // n = 전체 택배 수
        // w = 한 행의 최대 수
        // num = 내가 뺄 택배 번호
        
        int[][] storage = new int[(n/w)+1][w];
        
        int row = 0;
        int column = 0;
        
        int numRow = 0;
        int numCol = 0;
        
        for(int i = 1; i <= n; i++){
            if(row%2 == 0){ // 행 짝수면 우측진행
                if(i == num){
                    numRow = row;
                    numCol = column;
                }
                storage[row][column] = i;
                if(column == (w-1)){
                    row++;
                } else {
                    column++;
                }
            } else { // 행 홀수면 좌측진행
                if(i == num){
                    numRow = row;
                    numCol = column;
                }
                storage[row][column] = i;
                if(column == 0){
                    row++;
                } else {
                    column--;
                }
            }
        }

        if(storage[(n/w)][numCol] == 0){
            answer = (n/w) - numRow;
        } else {
            answer = (n/w)+1 - numRow;
        }

        return answer;
    }
}
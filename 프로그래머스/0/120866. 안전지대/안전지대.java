class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;

        // board 크기가 1일 때 예외 처리
        if (n == 1) {
            return board[0][0] == 0 ? 1 : 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 안전지대일 조건 => 본인이 지뢰가 아니고 주변(8방향)에 지뢰가 없을 때
                if (board[i][j] != 1) {
                    if (i == 0 && j == 0) { // [0, 0]
                        if (board[i][j+1] != 1 && board[i+1][j] != 1 && board[i+1][j+1] != 1) {
                            answer++;
                        }
                    } else if (i == 0 && j == n-1) { // [0, n-1]
                        if (board[i][j-1] != 1 && board[i+1][j] != 1 && board[i+1][j-1] != 1) {
                            answer++;
                        }
                    } else if (i == n-1 && j == 0) { // [n-1, 0] 
                        if (board[i-1][j] != 1 && board[i-1][j+1] != 1 && board[i][j+1] != 1) {
                            answer++;
                        }
                    } else if (i == n-1 && j == n-1) { // [n-1, n-1] 
                        if (board[i-1][j] != 1 && board[i-1][j-1] != 1 && board[i][j-1] != 1) {
                            answer++;
                        }
                    } else if (i == 0) { // [0, x] 
                        if (board[i][j-1] != 1 && board[i][j+1] != 1 &&
                            board[i+1][j-1] != 1 && board[i+1][j] != 1 && board[i+1][j+1] != 1) {
                            answer++;
                        }
                    } else if (i == n-1) { // [n-1, x]
                        if (board[i][j-1] != 1 && board[i][j+1] != 1 &&
                            board[i-1][j-1] != 1 && board[i-1][j] != 1 && board[i-1][j+1] != 1) {
                            answer++;
                        }
                    } else if (j == 0) { // [x, 0] 
                        if (board[i-1][j] != 1 && board[i+1][j] != 1 &&
                            board[i-1][j+1] != 1 && board[i][j+1] != 1 && board[i+1][j+1] != 1) {
                            answer++;
                        }
                    } else if (j == n-1) { // [x, n-1]
                        if (board[i-1][j] != 1 && board[i+1][j] != 1 &&
                            board[i-1][j-1] != 1 && board[i][j-1] != 1 && board[i+1][j-1] != 1) {
                            answer++;
                        }
                    } else { // [x, x]
                        if (board[i-1][j-1] != 1 && board[i-1][j] != 1 && board[i-1][j+1] != 1 &&
                            board[i][j-1] != 1 && board[i][j+1] != 1 &&
                            board[i+1][j-1] != 1 && board[i+1][j] != 1 && board[i+1][j+1] != 1) {
                            answer++;
                        }
                    }
                }
            }
        }

        return answer;
    }
}

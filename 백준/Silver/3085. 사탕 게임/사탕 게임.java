import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int check(char[][] switched, int startRow, int endRow, int startCol, int endCol){
        // 가장 긴 연속 개수를 구해서 개수(int)를 반환
        // 바뀐 부분만 체크하면 되기 때문에 시작/끝 행번호, 열번호 받아야 함
        int N = switched.length;
        int re = 1; // 반환할 값

        // 행 세기
        for(int row = startRow; row <= endRow; row++){
            int count = 1; // 세기 위한 카운트
            for(int i = 1; i < N; i++){
                if(switched[row][i] == switched[row][i-1]){ // 같으면
                    count ++;
                } else { // 다르면 1로 초기화
                    count = 1;
                }

                if(re < count){ // 카운트가 반환할 값보다 크면 교체
                    re = count;
                }
            }
        }

        // 열 세기
        for(int col = startCol; col <= endCol; col++){
            int count = 1; // 세기 위한 카운트
            for(int i = 1; i < N; i++){
                if(switched[i][col] == switched[i-1][col]){ // 같으면
                    count ++;
                } else { // 다르면 1로 초기화
                    count = 1;
                }

                if(re < count){ // 카운트가 반환할 값보다 크면 교체
                    re = count;
                }
            }
        }

        return re;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0. 배열 크기 N 받기
        int N = Integer.parseInt(br.readLine());

        // 1. NxN 사탕 배열 받기
        char[][] candies = new char[N][N];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                candies[i][j] = line.charAt(j);
            }
        }

        // 2. 두 인접한 칸을 교체하고, 교체했을 시 가장 긴 연속 개수 구하기 => 함수화해서 호출
        // 특정 칸과, 인접한 오른쪽 칸, 인접한 아래 칸만 바꾸면 됨
        int ans = 1;

        for(int i = 0; i < N; i++){ // candies[i][j]
            for(int j = 0; j < N; j++){
                if(j + 1 < N){ // 오른쪽 칸과 교체
                    char temp = candies[i][j];
                    candies[i][j] = candies[i][j+1];
                    candies[i][j+1] = temp;

                    int count = check(candies, i, i, j, j+1);
                    if(count > ans) ans = count;

                    // 비교 후 원래대로 돌려놓기
                    temp = candies[i][j];
                    candies[i][j] = candies[i][j+1];
                    candies[i][j+1] = temp;
                }

                if(i + 1 < N){ // 아랫쪽 칸과 교체
                    char temp = candies[i][j];
                    candies[i][j] = candies[i+1][j];
                    candies[i+1][j] = temp;

                    int count = check(candies, i, i+1, j, j);
                    if(count > ans) ans = count;

                    // 비교 후 원래대로 돌려놓기
                    temp = candies[i][j];
                    candies[i][j] = candies[i+1][j];
                    candies[i+1][j] = temp;
                }
            }
        }

        System.out.println(ans);
    }
}

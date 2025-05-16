import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] stat = new int[N][N];
        int ans = 1000;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                stat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<Integer> team0 = new ArrayList<>();
        ArrayList<Integer> team1 = new ArrayList<>();

        // 비트마스크로, 0번 팀 / 1번 팀으로 나누면 된다. => 2^N의 경우의 수 중 반으로 나뉜 경우
        for(int i= 0; i < (1 << N); i++){ // 모든 팀 나누기 경우의 수(불균형 포함)
            // 이 모든 경우의 수 중
            // 0팀과 1팀으로 나누면 된다..

            for(int j = 0; j < N; j++) {
                // N명의 선수에 대해 하나씩 검증
                if ((i & (1 << j)) == 0) { // 0팀
                    team0.add(j);
                } else { // 1팀
                    team1.add(j);
                }
            }

           if(team0.size() == N/2){ // 반 나뉘어졌으면
               // 진행 후 리셋
               int sum0 = 0;
               int sum1 = 0;

               for(int k = 0; k < N/2 - 1; k++){
                   for(int l = k + 1; l < N/2; l++){
                       sum0 += stat[team0.get(k)][team0.get(l)];
                       sum0 += stat[team0.get(l)][team0.get(k)];

                       sum1 += stat[team1.get(k)][team1.get(l)];
                       sum1 += stat[team1.get(l)][team1.get(k)];
                   }
               }

               int diff = Math.abs(sum0-sum1);
               if( diff < ans){
                   ans = diff;
               }
           }

           team0.clear();
           team1.clear();
        }

        System.out.println(ans);
    }
}
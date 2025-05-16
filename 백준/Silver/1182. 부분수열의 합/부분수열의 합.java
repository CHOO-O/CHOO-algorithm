import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정수의 개수 N
        int S = Integer.parseInt(st.nextToken()); // 합이 될 값 S
        int ans = 0;

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 모든 부분수열의 개수 = 2^N 개 => N개의 원소를 포함하고/안하고 => 비트마스크
        for(int i = 1; i < (1<<N); i++){ // 공집합 제외 모든 부분수열
            int sum = 0;
            for(int j = 0; j < N; j++){
                if((i & (1 << j)) != 0){ // i는 비트마스크이고, j번째 원소를 가지는지 확인
                    sum += nums[j];
                }
            }

            if(sum == S){
                ans++;
            }
        }

        System.out.println(ans);

    }
}
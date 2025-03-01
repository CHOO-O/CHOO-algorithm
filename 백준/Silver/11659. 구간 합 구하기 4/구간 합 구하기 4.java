import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열 길이 N
        int M = Integer.parseInt(st.nextToken()); // 연산 횟수 M

        st = new StringTokenizer(br.readLine()); // 주어진 배열

        long[] prefix = new long[N + 1]; // 합 배열

        for(int i = 1; i < N + 1; i++){
            prefix[i] = prefix[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int j = 0; j < M; j++){
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            System.out.println(prefix[r] - prefix[l- 1]);
        }
    }
}

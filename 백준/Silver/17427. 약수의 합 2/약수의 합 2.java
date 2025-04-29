import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N
        long ans = 0;

        // N 이하의 자연수 중 i를 약수로 갖는 수의 개수는 N/i개(버림)
        for(int i = 1; i <= N; i++){
            ans += (N/i)*i;
        }

        System.out.println(ans);
    }
}

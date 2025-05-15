import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken()); // 1 ~ 15
        int S = Integer.parseInt(st.nextToken()); // 1 ~ 28
        int M = Integer.parseInt(st.nextToken()); // 1 ~ 19
        // 최대는 15*28*19 = 7980

        int ans = 1;
        int e = 1;
        int s = 1;
        int m = 1;

        if(E == 1 && S == 1 && M == 1){
            System.out.println(ans);
            return ;
        }

        while(true){
            ans ++;
            e ++;
            s ++;
            m ++;
            if(e > 15) e = 1;
            if(s > 28) s = 1;
            if(m > 19) m = 1;

            if(E == e && S == s && M == m){
                System.out.println(ans);
                return ;
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        int answer = 0;

        st = new StringTokenizer(br.readLine());

        for(int n = 0; n < N; n++){
            int now = Integer.parseInt(st.nextToken());
            boolean flag = true;

            if(now < 2){
                flag = false;
                continue;
            }

            for(int i = 2; i*i <= now; i++){
                if(i*i == now){
                    flag = false;
                    break;
                } else if(now%i == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                answer ++;
            }

        }

        System.out.println(answer);
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();

        int M = Integer.parseInt(st.nextToken()); // 수행할 연산의 수
        int S = 0;

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            switch(type){
                case "add" :
                    S = S | (1 << Integer.parseInt(st.nextToken()));
                    break;
                case "remove" :
                    S = S & ~(1 << Integer.parseInt(st.nextToken()));
                    break;
                case "check" :
                    if((S & (1 << Integer.parseInt(st.nextToken())))== 0){
                        ans.append("0\n");
                    } else {
                        ans.append("1\n");
                    }
                    break;
                case "toggle" :
                    S = S ^ (1 << Integer.parseInt(st.nextToken()));
                    break;
                case "all" :
                    S = (1 << 21) - 1;
                    break;
                case "empty" :
                    S = 0;
                    break;
            }
        }

        System.out.println(ans);
    }
}
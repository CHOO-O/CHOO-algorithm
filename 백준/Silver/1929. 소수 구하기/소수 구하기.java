import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 지워졌는지를 체크할 배열. 기본값은 false, true이면 지워진 것(=소수가 아닌 것)
        boolean[] check = new boolean[N+1];
        check[0] = check[1] = true; // 0과 1은 제외

        for(int i = 2; i*i <= N; i++){ // 2부터 순서대로 체크
            if(check[i]){
                continue; // 지워져있으니 건너뛰기
            }
            for(int j = i+i; j <= N; j += i){ // i의 배수가 되는 수를 전부 지우기
                check[j] = true;
            }
        }

        for(int i = M; i <= N; i++){
            if(!check[i]){ // false면 출력하기
                System.out.println(i);
            }
        }

    }
}
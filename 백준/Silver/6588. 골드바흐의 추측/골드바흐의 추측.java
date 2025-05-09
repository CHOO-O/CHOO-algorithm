import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 백만까지의 소수 구하기
        int max = 1000000; // 백만

        // 지워졌는지를 체크할 배열. 기본값은 false, true이면 지워진 것(=소수가 아닌 것)
        boolean[] check = new boolean[max+1];
        check[0] = check[1] = true; // 0과 1은 제외
        ArrayList<Integer> sosu = new ArrayList<>(); // 저장할 arraylist

        for(int i = 2; i*i <= max; i++){ // 2부터 순서대로 체크
            if(check[i]){
                continue; // 지워져있으니 건너뛰기
            }

            sosu.add(i); // 소수목록에 저장
            for(int j = i+i; j <= max; j += i){ // i의 배수가 되는 수를 전부 지우기
                check[j] = true;
            }
        }

        // 2. 테스트케이스 돌리기
        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            for(int i = 0; i < sosu.size(); i++){ // 소수 목록 순회
                int temp = sosu.get(i);
                if(!check[n - temp]){ // 테스트케이스 n - 소수 = 소수 면 출력
                    System.out.println(n + " = " + temp + " + " + (n-temp));
                    break;
                }
            }
        }
    }
}
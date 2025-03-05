import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수의 개수 N

        st = new StringTokenizer(br.readLine()); // 주어진 배열

        long[] numbers = new long[N]; // 배열

        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers); // 투 포인터 알고리즘을 사용하려면 정렬되어야 함
        int answer = 0; // 결과

        for(int i = 0; i < N; i++){
            long find = numbers[i]; // 찾고자 하는 값
            int p1 = 0; // 앞 포인터
            int p2 = N - 1; // 뒤 포인터
            while(p1 < p2){
                if(numbers[p1] + numbers[p2] == find){
                    if(p1 != i && p2 != i){ // 예외) 찾고자 하는 값 본인은 제외해야 함
                        answer ++;
                        break;
                    } else if(p1 == i) {
                        p1 ++;
                    } else {
                        p2 --;
                    }
                } else if(numbers[p1] + numbers[p2] < find){ // 작다 > 값을 키워야 함 > 앞 포인터 증가
                    p1 ++;
                } else { // 크다 > 값을 줄여야 함 > 뒤 포인터 감소
                    p2 --;
                }
            }

        }

        System.out.println(answer);

    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] isBroken = new boolean[10];

    static int isPossible(int channel){
        if(channel == 0){
            if(isBroken[0]){
                return 0;
            } else {
                return 1;
            }
        }

        int len = 0;
        while(channel > 0){
            if(isBroken[channel%10]){ // 1의자리
                return 0;
            }

            len++;
            channel /= 10;
        }
        return len;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int start = 100; // 시작 채널은 100번
        int N = Integer.parseInt(br.readLine()); // 이동하려고 하는 채널 N
        int M = Integer.parseInt(br.readLine()); // 고장난 버튼의 개수 0 ~ 10

        if(M != 0){ // 고장난 버튼이 있는 경우 isBroken = true
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++){
                isBroken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        if(N == 100) { // 원하는 채널이 100인 경우 0회 출력 후 종료
            System.out.println(0);
            return;
        }

        // 정답의 초기값 => 숫자 안누르고 이동하는 횟수
        int ans = N - 100;
        if(ans < 0) ans = -ans;

        // 숫자 버튼을 눌러서 가능한 채널을 전부 탐색.
        // 여기서 최댓값이 100만인 이유
        // 모든 버튼이 고장났다고 했을 때, N의 최댓값인 50만번째 채널에 도착하려면 + 버튼을 499900번 눌러야 함. (= + 의 최대)
        // 마찬가지로, 어딘가에서 - 버튼만 499900번 누른다고 생각하면 거의 100만번째 채널에서 출발해야 함
        for(int i = 0; i <= 1000000; i++){
            // 이 i를 고장나지 않은 버튼으로 만들 수 있는가?
            int len = isPossible(i); // 만들 수 있으면 자릿수 반환, 없으면 0

            if(len > 0) {
                int count = i - N; // 이 숫자 - 목표채널 만큼 + 혹은 - 눌러야 함.
                if (count < 0) count = -count;

                if (len + count < ans) { // 숫자 자릿수 + 누를횟수가 현재 ans보다 작으면 교체
                    ans = len + count;
                }
            }
        }

        System.out.println(ans);
    }
}
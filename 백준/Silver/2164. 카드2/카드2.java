import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine()); // N

        if(N == 1){
            System.out.println(1);
            return;
        }

        Deque<Integer> cards = new LinkedList<>();
        // 위에서부터 1 ~ N => 덱의 앞에서부터 1 ~ N 값 집어넣기
        for(int i = 1; i <= N; i++){
            cards.addLast(i);
        }

        while(true){
            // 첫 번째 카드 버리기
            cards.removeFirst();

            // 버렸을 때 남는 카드 하나면 중단하고 출력
            if(cards.size() == 1){
                System.out.println(cards.getFirst());
                break;
            }

            // 다음 첫 번째 카드 뽑아서 뒤로 옮기기
            int first = cards.removeFirst();
            cards.addLast(first);
        }

    }
}

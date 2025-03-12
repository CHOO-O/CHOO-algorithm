import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine()); // 연산의 개수 N

        // 우선순위 큐 선언, 문제에 맞는 정렬 기준 세워주기. 기본값은 오름차순이다.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if(absA == absB) return a - b; // 만약 절댓값이 같으면 원래 값 기준으로 비교해서 오름차순 정렬
            return absA - absB; // 아니면 절댓값을 기준으로 오름차순 정렬
        });

        for(int i = 1; i <= N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                pq.add(num);
            } else {
                if(pq.isEmpty()){
                    System.out.println(0);
                } else {
                    System.out.println(pq.remove());
                }
            }
        }

    }
}

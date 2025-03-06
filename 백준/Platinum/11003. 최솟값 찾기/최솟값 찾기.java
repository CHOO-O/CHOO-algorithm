import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수의 개수 N
        int L = Integer.parseInt(st.nextToken()); // 범위 L = sliding window의 크기

        st = new StringTokenizer(br.readLine()); // 주어진 배열

        long[] array = new long[N];
        for(int i = 0; i < N; i++){
            array[i] = Long.parseLong(st.nextToken());
        }

        Deque<long[]> deque = new LinkedList<>();
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < N; i++){
            long[] now = {i, array[i]}; // index, array[index] 배열로 넣기

            // 무조건 최소값을 맨 앞에 집어넣으면 정렬이 유지가 될거임
            // index를 비교해서 window 크기를 벗어나는지 체크하는 조건문 하나,
            // array[index]를 비교해서 최소값인지를 체크하는 조건문 하나가 필요
//            System.out.println(Arrays.toString(now));

            while(!deque.isEmpty() && now[1] < deque.getLast()[1]){ // 이전에 넣었던 값보다 현재 넣을 값이 더 작으면, 어차피 이전에 넣은 값은 최소값이 될 수 없으므로 제거한다.
                deque.removeLast();
            }

            while(!deque.isEmpty() && deque.getFirst()[0] < i - L + 1){ // 현재 인덱스 - 윈도우 + 1 보다 작으면  = 윈도우 크기 벗어나면 삭제
                deque.removeFirst();
            }

            deque.addLast(now);

//            System.out.println("지금 첫번째값: " + Arrays.toString(deque.getFirst()) + " 지금 마지막값: " + Arrays.toString(deque.getLast()));
//            System.out.println("현재 덱 사이즈 : " + deque.size());
//            System.out.println("-------------------------------");
            answer.append(deque.getFirst()[1]).append(" ");

        }

        System.out.println(answer.toString().trim());
        
    }
}

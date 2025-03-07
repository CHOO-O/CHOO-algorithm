import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine()); // 수의 개수 n
        int[] numbers = new int[n]; // 완성할 수열을 담을 배열
        StringJoiner answer = new StringJoiner("\n"); // 결과를 출력할 stringjoiner

        for(int i = 0; i < n; i++){ // 완성할 수열
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> stack = new LinkedList<>(); // 스택 구현을 위한 덱
        int num = 1; // 스택에 오름차순으로 넣을 수
        boolean isNo = false;

        for(int i = 0; i < n; i++){
            int now = numbers[i]; // 현재 수열 수
            if(num <= now){ // 넣을 수가 수열 수보다 같거나 작으면
                while(num <= now){ // 수열 수가 될 때 까지 넣기
                    stack.addLast(num);
                    num++;
                    answer.add("+");
                }
                stack.removeLast();
                answer.add("-");
            } else { // 넣을 수가 수열 수보다 크면
                int last = stack.removeLast();
                if(now == last){ // 스택의 마지막 수가 수열 수와 같으면
                    answer.add("-");
                } else {
                    System.out.println("NO");
                    isNo = true;
                    break;
                }
            }
        }

        if(!isNo){
            System.out.println(answer);
        }
    }
}

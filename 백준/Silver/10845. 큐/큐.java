import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      Deque<Integer> queue = new ArrayDeque<>();

      for(int i = 0; i < n; i++){
        String in = br.readLine();
        StringTokenizer st = new StringTokenizer(in);

        switch(st.nextToken()){
          case "push": 
            int p = Integer.parseInt(st.nextToken());
            queue.addLast(p);
            break;
          case "pop": 
            System.out.println(queue.isEmpty() ? -1 : queue.removeFirst());
            break;
          case "size": 
            System.out.println(queue.size());
            break;
          case "empty": 
            System.out.println(queue.isEmpty() ? 1 : 0);
            break;
          case "front": 
            System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
            break;
          case "back":
            System.out.println(queue.isEmpty() ? -1 : queue.peekLast());
            break;
        }
      }
    }
}

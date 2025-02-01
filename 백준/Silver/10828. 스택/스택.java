import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine()); // 명령 수 가져오기
      Stack<Integer> stack = new Stack<>();

      for(int i = 0; i < n; i++){
        String in = br.readLine();
        StringTokenizer st = new StringTokenizer(in);

        switch(st.nextToken()){
          case "push": 
            int p = Integer.parseInt(st.nextToken());
            stack.push(p);
            break;
          case "pop": 
            System.out.println(stack.empty() ? -1 : stack.pop());
            break;
          case "size": 
            System.out.println(stack.size());
            break;
          case "empty": 
            System.out.println(stack.empty() ? 1 : 0);
            break;
          case "top": 
            System.out.println(stack.empty() ? -1 : stack.peek());
            break;
        }
      }
    }
}

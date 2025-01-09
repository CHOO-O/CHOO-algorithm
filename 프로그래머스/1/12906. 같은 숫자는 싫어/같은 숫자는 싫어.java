import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int a : arr){
            if(stack.isEmpty() || stack.peekLast() != a){
                stack.addLast(a);
            }
        }
        
        int[] answer = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--){
            answer[i] = stack.removeLast();
        }
        
        return answer;
    }
}
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        // 앞에서부터 빠지는, Queue 형태
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        
        for(String c1 : cards1){
            queue1.add(c1);
        }
        
        for(String c2 : cards2){
            queue2.add(c2);
        }
        
        for(String g : goal){
            if(queue1.peek() != null && queue1.peek().equals(g)){
                queue1.remove();
            } else if(queue2.peek() != null && queue2.peek().equals(g)) {
                queue2.remove();
            } else {
                answer = "No";
                return answer;
            }
        }
        
        return answer;
    }
}
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        
        int[] answer = new int[len];
        
        PriorityQueue<Integer> mj = new PriorityQueue<>();
        
        for(int i = 0; i < len; i++){
            if(mj.size() < k){
                mj.add(score[i]);
            } else {
                if(score[i] > mj.peek()){
                    mj.poll();
                    mj.add(score[i]);
                }
            }
            
            answer[i] = mj.peek();
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        int temp = start;
        ArrayList<Integer> ansArr = new ArrayList<>();
        
        while(temp >= end_num){
            ansArr.add(temp);
            temp -= 1;
        }
        
        int[] answer = new int[ansArr.size()];
        for(int i = 0; i < ansArr.size(); i++){
            answer[i] = ansArr.get(i);
        }
        
        return answer;
    }
}
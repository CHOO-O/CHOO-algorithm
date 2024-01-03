import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int temp = k;
        int mul = 1;
        ArrayList<Integer> ansArr = new ArrayList<>();
        
        while(temp <= n){
            ansArr.add(temp);
            mul ++;
            temp = k*mul;
        }
        
        int[] answer = new int[ansArr.size()];
        for(int i = 0; i < ansArr.size(); i++){
            answer[i] = ansArr.get(i);
        }
        
        return answer;
    }
}
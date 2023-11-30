import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> ansArr = new ArrayList<>();        
        
        ansArr.add(n);
        while(true){
            if(n == 1){
                break;
            } else if(n%2 == 0){
                ansArr.add(n/2);
                n = n/2;
            } else {
                ansArr.add((3*n) + 1);
                n = (3*n) + 1;
            }
        }
        
        int[] answer = new int[ansArr.size()];
        for(int i = 0; i < ansArr.size(); i++){
            answer[i] = ansArr.get(i);
        }
        
        return answer;
    }
}
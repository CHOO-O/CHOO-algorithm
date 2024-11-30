import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 1; i*i <= n; i++){
            if(i*i == n){
                temp.add(i);
            } else if (n%i == 0){
                temp.add(i);
                temp.add(n/i);
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
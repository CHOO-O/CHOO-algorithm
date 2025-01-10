import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int a: arr){
            if(a % divisor == 0){
                temp.add(a);
            }
        }
        
        int[] answer = new int[temp.size()];
        if(temp.size() == 0){
            return new int[] {-1};
        } else {
            for(int i = 0; i < temp.size(); i++){
                answer[i] = temp.get(i);
            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        int i = 0; 
        while(i*2 + 1 <= n){
            temp.add(i*2 + 1);
            i++;
        }
        
        int[] answer = new int[temp.size()];
        
        for(int j = 0; j < temp.size(); j++){
            answer[j] = temp.get(j);
        }
        
        return answer;
    }
}
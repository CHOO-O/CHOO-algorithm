import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> numAl = new ArrayList<>();
        
        for(int nn : numlist){
            if(nn%n == 0){
                numAl.add(nn);
            }
        }
        
        int[] answer = new int[numAl.size()];
        
        for(int i = 0; i < numAl.size(); i++){
            answer[i] = numAl.get(i);
        }
        
        return answer;
    }
}
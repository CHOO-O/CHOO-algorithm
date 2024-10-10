import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i]*2; j++){
                    temp.add(arr[i]);
                }
            } else {
                for(int k = 0; k < arr[i]; k++){
                    temp.remove(temp.size() - 1);
                }
            }
        }
    
        int[] answer = new int[temp.size()];
        
        for(int l = 0; l < temp.size(); l++){
            answer[l] = temp.get(l);
        }
        
        return answer;
    }
}
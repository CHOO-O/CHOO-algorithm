import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(temp.size() == 0){
                temp.add(arr[i]);
            } else if(temp.get(temp.size() - 1).equals(arr[i])) {
                temp.remove(temp.size() -1);
            } else {
                temp.add(arr[i]);
            }
        }
        
        if(temp.size() == 0){
            int[] ans0 = { -1 };
            return ans0;
        } else {
            int[] answer = new int[temp.size()];
        
            for(int j = 0; j < temp.size(); j++){
                answer[j] = temp.get(j);
            }
            
            return answer;
        }
    }
}
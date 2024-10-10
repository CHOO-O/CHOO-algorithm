import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int num : arr){
            if(!temp.contains(num)){
                temp.add(num);
            }
        }
        
        if(temp.size() < k){ // k 보다 작으면
            while(temp.size() < k){
                temp.add(-1);
            }  
        } else if(temp.size() > k) { // k 보다 크면
            int[] ans1 = new int[k];
        
            for(int i = 0; i < k; i++){
                ans1[i] = temp.get(i);
            }
            
            return ans1;
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}
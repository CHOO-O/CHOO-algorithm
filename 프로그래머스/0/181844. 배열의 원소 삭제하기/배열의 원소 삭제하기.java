import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        Arrays.sort(delete_list);
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){ 
            if(Arrays.binarySearch(delete_list, arr[i]) < 0 ){
                temp.add(arr[i]);
            } 
        }
        
        int[] answer = new int[temp.size()];
        
        for(int k = 0; k < temp.size(); k++){
            answer[k] = temp.get(k);
        }
        
        return answer;
    }
}
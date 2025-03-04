import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[] {-1};
        }
        
        int[] sort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sort);
        
        int min = sort[0];
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int a : arr){
            if(a != min){
                temp.add(a);
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}
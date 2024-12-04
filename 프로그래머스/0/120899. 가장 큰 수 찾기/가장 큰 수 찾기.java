import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] sort = Arrays.copyOf(array, array.length);
        Arrays.sort(sort);
        
        int l = array.length;
        
        int a = sort[l - 1];
        answer[0] = a;
        
        int idx = 0; 
        while(idx < l){
            if(array[idx] == a){
                answer[1] = idx;
                break;
            }
            idx++;
        }  
        
        return answer;
    }
}
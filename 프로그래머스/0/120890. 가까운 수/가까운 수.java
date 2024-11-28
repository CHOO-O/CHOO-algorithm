import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int bigger = n;
        int smaller = n;
        
        Arrays.sort(array);
        
        if(Arrays.binarySearch(array, n) >= 0){
            answer = n;
            return answer;
        }
        
        while(true){
            bigger += 1;
            smaller -= 1;
            
            if(Arrays.binarySearch(array, smaller) >= 0){
                answer = smaller;
                break;
            } else if(Arrays.binarySearch(array, bigger) >= 0){
                answer = bigger;
                break;
            }
        }
        
        return answer;
    }
}
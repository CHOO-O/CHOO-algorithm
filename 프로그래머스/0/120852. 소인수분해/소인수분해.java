import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> hash = new HashSet<>();
        int i = 2;
        
        while(n > 1){
            if(n % i == 0){
                hash.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        
        int[] answer = new int[hash.size()];
        
        int j = 0;
        for(int num : hash){
            answer[j] = num;
            j++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
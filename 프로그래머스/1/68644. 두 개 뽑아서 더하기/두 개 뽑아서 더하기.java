import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i = 1; i < numbers.length; i++){
            for(int j = 0; j < i; j++){
                hash.add(numbers[i] + numbers[j]);
            }
        }
        
        Object[] temp = hash.toArray();
        int[] answer = new int[temp.length];
        for(int t = 0; t < temp.length; t++){
            answer[t] = (int)temp[t];
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
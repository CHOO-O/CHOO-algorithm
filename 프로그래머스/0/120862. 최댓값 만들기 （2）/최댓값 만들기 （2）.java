import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int l = numbers.length;
        
        int max = 0;
        int a = numbers[0]*numbers[1];
        int b = numbers[l-1]*numbers[l-2];
        int c = numbers[0]*numbers[l-1];
        
        max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        
        answer = max;
        
        return answer;
    }
}
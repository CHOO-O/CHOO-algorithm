import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] charr = str.toCharArray();
    
        Arrays.sort(charr);
        
        for(int i = charr.length - 1; i >= 0; i--){
            answer = answer*10 + (long)(charr[i]-48);
        }
        
        return answer;
    }
}
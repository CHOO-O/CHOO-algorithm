import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] sar = s.toCharArray();
        Arrays.sort(sar);
        
        for(int i = sar.length - 1; i >= 0; i--){
            answer += sar[i];
        }
        
        return answer;
    }
}
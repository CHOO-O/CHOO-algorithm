import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] spstr = s.split(" ");
        int[] spint = new int[spstr.length];
        for(int i = 0; i < spstr.length; i++){
            spint[i] = Integer.parseInt(spstr[i]);
        }
        
        Arrays.sort(spint);
        
        answer = spint[0] + " " + spint[spint.length-1];

        return answer;
    }
}
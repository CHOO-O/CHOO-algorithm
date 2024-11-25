import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String temp = my_string.replaceAll("[a-z]","");
        
        int[] answer = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            answer[i] = temp.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
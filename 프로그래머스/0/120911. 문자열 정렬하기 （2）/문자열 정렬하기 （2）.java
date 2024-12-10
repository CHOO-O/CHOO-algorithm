import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] lstr = (my_string.toLowerCase()).split("");
        
        Arrays.sort(lstr);
        for(String s : lstr){
            answer += s;
        }
        
        return answer;
    }
}
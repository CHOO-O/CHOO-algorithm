import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i = 0; i < index_list.length; i++){
            char temp = my_string.charAt(index_list[i]);
            answer += String.valueOf(temp);
        }
        
        return answer;
    }
}
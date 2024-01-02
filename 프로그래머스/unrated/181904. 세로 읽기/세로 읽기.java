import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        //첫번째 c
        //해당 인덱스 + m
        int idx = c;
        while(idx <= my_string.length()){
            // System.out.println(my_string.charAt(idx - 1));
            // my_string.charAt(idx);
            String temp = String.valueOf(my_string.charAt(idx - 1));
            answer += temp;
            idx += m;
        }
        
        return answer;
    }
}
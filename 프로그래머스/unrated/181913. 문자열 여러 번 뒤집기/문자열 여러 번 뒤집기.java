import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        int s = 0;
        int e = 0;
        char temp = ' ';
        char[] ansChar = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];

            while(s <= e){
                temp = ansChar[s];
                ansChar[s] = ansChar[e];
                ansChar[e] = temp;
                s++;
                e--;
            }
        }
        
        answer = String.valueOf(ansChar);
        
        return answer;
    }
}
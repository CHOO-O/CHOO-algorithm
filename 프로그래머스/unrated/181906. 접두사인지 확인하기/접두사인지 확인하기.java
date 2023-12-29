import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> ansArr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            ansArr.add(my_string.substring(0, i));
        }
        ansArr.add(my_string);
        
        answer = ansArr.contains(is_prefix) ? 1 : 0;
        
        return answer;
    }
}
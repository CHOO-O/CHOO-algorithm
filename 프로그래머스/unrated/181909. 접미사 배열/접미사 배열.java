import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> ansArr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            ansArr.add(my_string.substring(i));
        }
        
        String[] answer = new String[ansArr.size()];
        
        for(int j = 0; j < ansArr.size(); j++){
            answer[j] = ansArr.get(j);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
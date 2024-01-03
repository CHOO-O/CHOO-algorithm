import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList<Character> strArr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            strArr.add(my_string.charAt(i));
        }
        
        Arrays.sort(indices);
        for(int j = 0; j < indices.length; j++){
            strArr.remove(indices[indices.length - j - 1]);
        }
        
        for(int k = 0; k < strArr.size(); k++){
            answer += String.valueOf(strArr.get(k));
        }
        
        return answer;
    }
}
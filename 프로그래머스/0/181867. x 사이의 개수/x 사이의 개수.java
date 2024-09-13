import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] temp = myString.split("x");    
        ArrayList<String> tempList = new ArrayList<>(Arrays.asList(temp));
        
        if(myString.charAt(myString.length() - 1) == 'x'){
            tempList.add("");
        }
        
        int[] answer = new int[tempList.size()];
        
        for(int i = 0; i < tempList.size(); i++){
            answer[i] = tempList.get(i).length();
        }
        
        return answer;
    }
}
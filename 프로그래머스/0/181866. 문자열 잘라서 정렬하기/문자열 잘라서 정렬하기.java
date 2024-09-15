import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] spl = myString.split("x");
        Arrays.sort(spl);
        ArrayList<String> splList= new ArrayList<String>(Arrays.asList(spl));
        splList.removeIf(str -> str.equals(""));
        
        String[] answer = new String[splList.size()];
        
        for(int i = 0; i < splList.size(); i++){
            answer[i] = splList.get(i);
        }
        
        return answer;
    }
}
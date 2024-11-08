import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> ans = new ArrayList<>();
        String temp = "";
        
        for(int i = 0; i < picture.length; i++){
            for(int j = 0; j < picture[i].length(); j++){
                String t = picture[i].substring(j, j+1);
                for(int l = 0; l < k; l++){
                    temp += t;
                } 
            }
            for(int l = 0; l < k; l++){
                ans.add(temp);
            } 
            temp = "";
        }
        
        String[] answer = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}
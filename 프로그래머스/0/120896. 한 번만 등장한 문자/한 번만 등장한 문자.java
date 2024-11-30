import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> check = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            c.add(s.charAt(i));
        }
        
        for(Character cc : c){
            int cnt = 0; 
            for(int i = 0; i < s.length(); i++){
                if(cc == s.charAt(i)){
                    cnt++;
                }
            }
            
            if(cnt == 1){
                check.add(cc);
            }
        }
        
        char[] res = new char[check.size()]; 
            
        for(int i = 0; i < check.size(); i++){
            res[i] = check.get(i);
        }
        
        Arrays.sort(res);
        
        for(char r : res){
            answer += r;
        }
        
        return answer;
    }
}
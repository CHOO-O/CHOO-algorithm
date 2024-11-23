import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] letArray = letter.split(" ");
        for(String l : letArray){
            for(int i = 0; i < morse.length; i++){
                if(l.equals(morse[i])){
                    answer += (char) (i + 97);
                }
            }
        }
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] bab = Arrays.copyOf(babbling, babbling.length);
        
        for(int i = 0; i < bab.length; i++){
            for(String w : words){
                bab[i] = bab[i].replace(w, ".");
            }
        }
        
        for(String b: bab){
            // System.out.println(b);
            if((b.replace(".", "")).length() == 0){
                answer ++;
            }
        }
        
        return answer;
    }
}
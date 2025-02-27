class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String low = "abcdefghijklmnopqrstuvwxyz";
        String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // a = 97, A = 65
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                answer += ' ';
            } else if(Character.isLowerCase(c)){
                int idx = c+n-97;
                if(idx >= low.length()){
                    answer += low.charAt(idx - 26);
                } else {
                    answer += low.charAt(idx);
                }
            } else {
                int idx = c+n-65;
                if(idx >= up.length()){
                    answer += up.charAt(idx - 26);
                } else {
                    answer += up.charAt(idx);
                }
            }
        }
        
        
        return answer;
    }
}
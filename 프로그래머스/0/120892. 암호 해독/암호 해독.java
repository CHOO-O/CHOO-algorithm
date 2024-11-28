class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int idx = code;
        
        while(idx <= cipher.length()){
            answer += cipher.charAt(idx - 1);
            idx += code;
        }
        
        return answer;
    }
}
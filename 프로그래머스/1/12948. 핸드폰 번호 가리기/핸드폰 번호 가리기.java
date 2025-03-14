class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int l = phone_number.length() - 4;    
        
        answer = "*".repeat(l) + phone_number.substring(l, phone_number.length());
        
        return answer;
    }
}
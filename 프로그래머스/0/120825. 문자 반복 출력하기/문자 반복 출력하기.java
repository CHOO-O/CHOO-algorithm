class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            for(int c = 0; c < n; c++){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}
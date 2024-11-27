class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numonly = my_string.replaceAll("[a-zA-Z]", "");
        
        for(int i = 0; i < numonly.length(); i++){
            answer += numonly.charAt(i) - '0';
        }
        
        return answer;
    }
}
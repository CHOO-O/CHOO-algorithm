class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] temp = num_str.split("");
        
        for(int i = 0; i < temp.length; i++){
            answer += Integer.parseInt(temp[i]);
        }
        
        
        return answer;
    }
}
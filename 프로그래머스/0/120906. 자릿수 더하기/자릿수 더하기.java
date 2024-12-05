class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] s = (String.valueOf(n)).split("");
        
        for(String ss : s){
            answer += Integer.valueOf(ss);
        }
        
        return answer;
    }
}
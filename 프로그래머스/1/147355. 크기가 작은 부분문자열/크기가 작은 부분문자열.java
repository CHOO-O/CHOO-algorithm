class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        int i = 0;
        
        while(i+len <= t.length()){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i, i+len))){
                answer++;   
            }
            i++;
        }
        
        return answer;
    }
}
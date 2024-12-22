class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int now  = 1;
        
        while(cnt < n){
            if(now%3 == 0 || String.valueOf(now).contains("3")){
                now ++;
                continue;
            }
            now++;
            cnt++;
        }
        
        answer = now - 1;
        
        return answer;
    }
}
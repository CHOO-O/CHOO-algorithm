class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        long now = 0;
        
        while(idx < n){
            now += x;
            answer[idx] = now;
            idx++;
        }
        
        return answer;
    }
}
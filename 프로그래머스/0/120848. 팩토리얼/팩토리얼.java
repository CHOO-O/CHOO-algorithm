class Solution {
    public int solution(int n) {
        int answer = 1;
        int p = 1;
        
        while(true){
            p*=answer;
            if(p>n){
                return answer-1;
            }
            answer++;
        }
    }
}
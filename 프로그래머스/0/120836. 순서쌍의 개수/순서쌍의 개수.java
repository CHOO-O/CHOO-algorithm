class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 약수 순서쌍 개수 구하라는 뜻
        for(int i = 1; i*i <= n; i++){
            if(i*i == n){
                answer++;
            } else if(n%i == 0){
                answer += 2;
            }
        }   
        
        return answer;
    }
}
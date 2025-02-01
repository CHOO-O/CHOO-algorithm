class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++){
            boolean f = true;
  
            for(int j = 1; j*j <= i; j++){
                if(j*j == i){
                    f = false;
                    break;
                } else if(j != 1 && i%j == 0){
                    f = false;
                    break;
                }
            }
            
            answer = f ? answer += 1 : answer;

        }
        
        return answer;
    }
}
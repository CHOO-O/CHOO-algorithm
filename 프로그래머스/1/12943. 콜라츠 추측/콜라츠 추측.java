class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        int cnt = 0;
        
        if(num == 1){
            return 0;
        }
        
        while(true){
            n = n%2 == 0 ? n/2 : n*3 + 1;
            cnt ++;

            if(n == 1){
                answer = cnt;
                break;
            } else if(cnt == 500){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
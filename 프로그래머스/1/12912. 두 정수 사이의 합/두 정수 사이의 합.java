class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        
        if(a > b){
            temp = b;
            while(temp <= a){
                answer += temp;
                temp++;
            }
        } else if(a < b){
            temp = a;
            while(temp <= b){
                answer += temp;
                temp++;
            }
        } else {
            return a;
        }
        
        return answer;
    }
}
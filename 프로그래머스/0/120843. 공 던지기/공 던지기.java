class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num = numbers.length;
        int now = 1;

        for(int i = 1; i <= k; i++){
            answer = now;
            now += 2;
            if(now > num){
                now -= num;
            }
        }     
        
        return answer;
    }
}
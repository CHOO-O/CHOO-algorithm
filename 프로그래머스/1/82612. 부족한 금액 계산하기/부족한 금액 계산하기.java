class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        
        for(int i = 1; i <= count; i++){
            sum += i*price;
        }
        
        long calc = sum - money;
        if(calc > 0){
            answer = calc;
        } else {
            answer = 0;
        }

        return answer;
    }
}
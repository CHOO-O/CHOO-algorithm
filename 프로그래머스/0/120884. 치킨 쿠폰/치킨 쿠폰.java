class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = chicken;
        int coupon = 0;
        int service = 0;
        
        while(temp > 0){
            temp--;
            coupon++;
            if(coupon == 10){
                service++;
                coupon = 1;
            }
        }
        
        answer = service;
        
        return answer;
    }
}
class Solution {
    public String solution(int n) {
        String answer = "";
        int num = n;
        
        // 1. 1의자리는 3으로 나눴을 때 나머지가 1이면 1, 2면 2, 0이면 4
        
        while(num > 0){
            if(num%3 == 1){
                answer = "1" + answer;
                num /= 3;
            } else if(num%3 == 2){
                answer = "2" + answer;
                num /= 3;
            } else {
                answer = "4" + answer;
                num = (num/3) - 1;
            }
        }
        
        return answer;
    }
}
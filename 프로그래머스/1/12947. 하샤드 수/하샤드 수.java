class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int temp = x;
        
        while(true){
            if(temp >= 10){
                sum += temp%10;
                temp = temp/10;    
            } else {
                sum += temp;   
                break;
            }
        }
        answer = x%sum == 0 ? true : false;
        
        return answer;
    }
}
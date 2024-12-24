class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int x = a;
        int y = b;
        int i = 2;
        
        while(i <= x){
            if(x%i == 0 && y%i == 0){
                x /= i;
                y /= i;
            } else {
                i++;
            }
        }
        
        System.out.println(x+","+y);
        
        while(true){
            if(y == 1){
                answer = 1;
                break;
            }
            
            if(y % 2 != 0){
                if(y % 5 != 0){
                    answer = 2;
                    break;
                } else {
                    y /= 5;
                }
            } else {
                y /= 2;
            }
        }
            
        return answer;
    }
}
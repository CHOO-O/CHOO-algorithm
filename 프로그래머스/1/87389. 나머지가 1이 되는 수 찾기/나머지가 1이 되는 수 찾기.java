class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 2;
        
        while(true){
            if(n%x == 1){
                return x;
            } else {
                x++;
            }
        }
    }
}
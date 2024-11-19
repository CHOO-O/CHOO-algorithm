class Solution {
    public int solution(int n) {
        int pizza = 0;
        
        if(n%6 == 0){
            return n/6;
        } else {
            while(true){
                pizza++;
                if((pizza*6)%n == 0){
                    return pizza;
                }
            }
        }
    }
}
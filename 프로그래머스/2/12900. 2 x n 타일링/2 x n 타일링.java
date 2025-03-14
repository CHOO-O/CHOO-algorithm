class Solution {
    private int[] memory = new int [60001];

    private int calc(int n){
        if(n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        } else if(memory[n] != 0){
            return memory[n];
        } else {
            memory[n] = (calc(n-1) + calc(n-2))%1000000007;
        }
        
        return memory[n];
    }
    
    public int solution(int n) {
        int answer = calc(n);
        
        return answer;
    }
}
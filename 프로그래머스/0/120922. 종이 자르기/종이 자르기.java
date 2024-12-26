class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        if(M >= N){
            answer = cut(M, N);
        } else {
            answer = cut(N, M);
        }
        
        return answer;
    }
    
    private int cut(int big, int small){
        if(small != 1){
            return (small - 1) + small*(big-1);
        } else {
            return big - 1;
        }
    }
}
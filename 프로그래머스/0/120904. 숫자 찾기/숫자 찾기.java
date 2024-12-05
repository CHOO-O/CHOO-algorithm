class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] n = String.valueOf(num).split("");
        
        for(int i = 0; i < n.length; i++){
            if(Integer.valueOf(n[i]) == k){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++){
            int cnt = emergency.length;
            for(int e : emergency){
                if(emergency[i] > e){
                    cnt--;
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}
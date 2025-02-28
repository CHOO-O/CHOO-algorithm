class Solution {
    public int[] solution(long n) {
        int len = (String.valueOf(n)).length();
        int[] answer = new int[len];
        long temp = n;
        
        for(int i = 0; i < len; i++){
            answer[i] = (int)(temp%10);
            temp = temp/10;
        }
        
        return answer;
    }
}
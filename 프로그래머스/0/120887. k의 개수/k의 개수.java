class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int num = i;
        
        while(num <= j){
            char[] nums = String.valueOf(num).toCharArray();
            for(char c : nums){
                if(c - '0' == k){
                    answer++;
                }
            }
            num++;
        }
        
        
        return answer;
    }
}
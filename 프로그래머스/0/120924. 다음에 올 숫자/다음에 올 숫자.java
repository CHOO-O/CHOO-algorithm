class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int r = 0;
        int l = common.length - 1;
        
        if(common[l] - common[l-1] == common[l-1] - common[l-2]){
            r = common[l] - common[l-1];
            answer = common[l] + r;
        } else {
            r = common[l] / common[l-1];
            answer = common[l] * r;
        }
         
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int idx = 0;
            
        while(idx < num_list.length){
            if(num_list[idx] >= 0){
                idx ++;
            } else {
                return idx;
            }
        }
        
        return -1;
    }
}
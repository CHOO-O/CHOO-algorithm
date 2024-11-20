class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int e_cnt = 0;
        int o_cnt = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                e_cnt++;
            } else {
                o_cnt++;
            }
        }
        
        answer[0] = e_cnt;
        answer[1] = o_cnt;
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int lastNum = num_list[len - 1];
        int beforeNum = num_list[len - 2];
        int newNum = lastNum > beforeNum ? lastNum - beforeNum : lastNum*2;
        int[] answer = new int[len + 1];
        
        for(int i = 0; i < len; i++){
            answer[i] = num_list[i];
        }
        answer[len] = newNum;
        
        return answer;
    }
}
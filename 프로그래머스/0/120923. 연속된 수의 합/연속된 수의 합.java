class Solution {
    public int[] solution(int num, int total) {
        int start = (num/2)*(-1);
        int sum = 0;
        
        while(true){
            int temp = start;
            for(int i = 1; i <= num; i++){
                sum += temp;
                temp++;
            }
            if(sum == total){
                break;
            } else {
                start++;
                sum = 0;
            }
        }
        
        int[] answer = new int[num];
        for(int i = 0; i < num; i++){
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}
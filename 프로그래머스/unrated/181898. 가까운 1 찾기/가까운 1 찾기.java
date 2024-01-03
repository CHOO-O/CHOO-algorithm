class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        int i = idx;

        while(i < arr.length){
            if(arr[i] == 0){
                i += 1;
            } else {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
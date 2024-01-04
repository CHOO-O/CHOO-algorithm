class Solution {
    public int[] solution(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int idxS = 0;
        int idxE = 0;
        
        //앞에서부터 처음 2를 만날 때 멈추기
        while(s < arr.length){
            if(arr[s] == 2){
                idxS = s;
                break;
            } else s++;
        }
        
        //뒤에서부터 처음 2를 만날 때 멈추기
        while(e >= 0){
            if(arr[e]==2){
                idxE = e;
                break;
            } else e--;
        }
        
        if(idxS == 0 && idxE == 0){
            return new int[]{-1};
        } else {
            int[] answer = new int[idxE - idxS + 1];
            for(int i = 0; i < idxE - idxS + 1; i++){
                answer[i] = arr[idxS + i];
            }
            return answer;
        }
    }
}
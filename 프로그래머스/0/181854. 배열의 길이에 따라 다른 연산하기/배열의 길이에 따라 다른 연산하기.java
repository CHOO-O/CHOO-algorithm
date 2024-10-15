class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        int i;
        
        if(arr.length % 2 == 0){
            i = 1;
        } else {
            i = 0;
        }
        
        for(int j = i; j < arr.length; j+=2){
            arr[j] = arr[j] + n;
        }
        
        return arr;
    }
}
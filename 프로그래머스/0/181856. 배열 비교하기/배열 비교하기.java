class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length){
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            int a1 = 0;
            int a2 = 0;
            for(int n1 : arr1){
                a1 += n1;
            }
            
            for(int n2: arr2){
                a2 += n2;
            }
            
            if(a1 > a2){
                return 1;
            } else if (a1 < a2){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
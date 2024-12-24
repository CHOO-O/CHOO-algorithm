import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        Arrays.sort(numlist);
        
        int i = 0;
        int u = n+1;
        int d = n-1;
        
        if(Arrays.binarySearch(numlist, n) >= 0){
            answer[0] = n;
            i++;
        }
        
        while(i < numlist.length){
            if(Arrays.binarySearch(numlist, u) < 0 && Arrays.binarySearch(numlist, d) < 0){
                u++;
                d--;
            } else if(Arrays.binarySearch(numlist, u) >= 0 && Arrays.binarySearch(numlist, d) >= 0) {
                answer[i] = u;
                u++;
                answer[i+1] = d;
                d--;
                i += 2;
            } else if(Arrays.binarySearch(numlist, u) >= 0){
                answer[i] = u;
                u++;
                i++;
                d--;
            } else if(Arrays.binarySearch(numlist, d) >= 0){
                answer[i] = d;
                d--;
                i++;
                u++;
            }
        }
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for(String s: s1){
            if(Arrays.binarySearch(s2, s) >= 0){
                answer ++;
            }
        }
        
        return answer;
    }
}
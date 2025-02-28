import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int sum = 0;
        int idx = 0;
        
        while(true){
            sum += d[idx];
            if(sum > budget){
                break;
            }
            idx++;
            answer++;
            
            if(idx == d.length){
                break;
            }
        }

        return answer;
    }
}
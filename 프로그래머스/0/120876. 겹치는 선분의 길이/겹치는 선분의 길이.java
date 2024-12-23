import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashMap<String, Integer> bar = new HashMap<>();
        
        for(int i = 0; i < lines.length; i++){
            for(int x = lines[i][0]; x < lines[i][1]; x++){
                String key = x + "," + (x+1);
                bar.put(key, bar.getOrDefault(key, 0) + 1);
            }
        }
        
        for(Integer val : bar.values()){
            if(val > 1){
                answer++;
            }
        }
        
        return answer;
    }
}
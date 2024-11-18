import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> count = new HashMap<>();
        
        for(int i : array){
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        
        int maxVal = 0;
        int maxKey = 0;
        boolean isDup = false;
        
        for(int k : count.keySet()){
            if(count.get(k) > maxVal){
                maxVal = count.get(k);
                maxKey = k;
                isDup = false;
            } else if (count.get(k) == maxVal){
                isDup = true;
            }
        }
        
        if(isDup == true){
            return -1;
        } else {
            return maxKey;
        }
    }
}
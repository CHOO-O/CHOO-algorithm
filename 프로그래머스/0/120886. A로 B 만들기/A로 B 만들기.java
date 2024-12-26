import java.util.HashMap;

class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> bfreq = new HashMap<>();
        HashMap<Character, Integer> afreq = new HashMap<>();
        
        for(char b : before.toCharArray()){
            bfreq.put(b, bfreq.getOrDefault(b, 0)+1);
        }
        
        for(char a : after.toCharArray()){
            afreq.put(a, afreq.getOrDefault(a, 0)+1);
        }
        
        for(char ak : afreq.keySet()){
            if(bfreq.containsKey(ak)){
                if(bfreq.get(ak) < afreq.get(ak)){
                    return 0;
                }
            } else {
                return 0;   
            }
        }
            
        return 1;
    }
}
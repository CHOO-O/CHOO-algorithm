import java.util.HashMap;
import java.util.Collection;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        
        for(String s : strArr){ // 길이 : 카운트
            int key = s.length();
            cnt.put(key, cnt.getOrDefault(key, 0) + 1);
        }
        
        Collection<Integer> max = cnt.values();
        
        int answer = 0;
        for(int m : max){
            if(m > answer){
                answer = m;
            }
        }
        
        return answer;
    }
}
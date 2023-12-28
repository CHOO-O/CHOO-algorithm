import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ansArr = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            int temp = Integer.parseInt(intStrs[i].substring(s, s+l));

            if(temp > k){
                ansArr.add(temp);
            }
        }
        
        int[] answer = new int[ansArr.size()];
        
        for(int j = 0; j < ansArr.size(); j++){
            answer[j] = ansArr.get(j);
        }
        
        return answer;
    }
}
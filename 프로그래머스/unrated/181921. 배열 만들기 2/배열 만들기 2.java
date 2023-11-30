import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String numSt = String.valueOf(i);
            boolean isOk = true;
            
            for(int j = 0; j < numSt.length(); j++){
                if(numSt.charAt(j) != '0' && numSt.charAt(j) != '5'){
                    isOk = false;
                }
            }

            if(isOk == true){
                temp.add(i);
                System.out.printf("%d ", i);
            }
        }
        
        if(temp.size() == 0){
            int[] answer1 = {-1};
            return answer1;
        } else {
            int[] answer2 = new int[temp.size()];
            for(int k = 0; k < temp.size(); k++){
                answer2[k] = temp.get(k);
            }
            return answer2;
        }
    }
}
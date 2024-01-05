import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        // 뒤에부터
        for(int i = 0; i < num_list.length - n; i++){
            temp.add(num_list[n + i]);
        }

        // 앞에
        for(int j = 0; j < n; j++){
            temp.add(num_list[j]);
        }

        int[] answer = new int[temp.size()];
        for(int k = 0; k < temp.size(); k++){
            answer[k] = temp.get(k);
        }
        
        return answer;
    }
}
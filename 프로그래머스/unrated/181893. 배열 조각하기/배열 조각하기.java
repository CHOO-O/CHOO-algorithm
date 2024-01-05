import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            temp.add(arr[i]);
        }
        
        for(int idx = 0; idx < query.length; idx++){
            if(idx % 2 == 0){ //짝
                temp.subList(query[idx] + 1, temp.size()).clear();
            } else { //홀
                temp.subList(0,query[idx]).clear();
            }
        }
        
        int[] answer = new int[temp.size()];
        
        for(int j = 0; j < temp.size(); j++){
            answer[j] = temp.get(j);    
        }
        
        return answer;
    }
}
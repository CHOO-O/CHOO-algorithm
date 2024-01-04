import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] temp = new int[2];
        ArrayList<Integer> ansArr = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            temp = intervals[i];
            int s = temp[0];
            int e = temp[1];
            while(s <= e){
                ansArr.add(arr[s]);
                s ++;
            }
        }
        
        int[] answer = new int[ansArr.size()];
        for(int j = 0; j < ansArr.size(); j++){
            answer[j] = ansArr.get(j);
        }
        
        return answer;
    }
}
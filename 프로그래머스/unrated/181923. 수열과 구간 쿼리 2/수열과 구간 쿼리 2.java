import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];

            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    temp.add(arr[j]);
                } 
            }
            
            int[] tempArr = new int[temp.size()];
            for(int l = 0; l < temp.size(); l++){
                tempArr[l] = temp.get(l);
            }
            
            Arrays.sort(tempArr);
            
            int result = temp.size() != 0 ? tempArr[0] : -1;
            ans.add(result);
        }
        
        int[] answer = new int[ans.size()];
        for(int n = 0; n < ans.size(); n++){
            answer[n] = ans.get(n);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int idx = 0;
        ArrayList<Integer> ansArr = new ArrayList<>();
        
        switch(n){
            case 1: 
                idx = 0;
                while(idx <= b){
                    ansArr.add(num_list[idx]);
                    idx ++;
                }
                break;
            case 2:
                idx = a;
                while(idx < num_list.length){
                    ansArr.add(num_list[idx]);
                    idx ++;
                }
                break;
            case 3:
                idx = a;
                while(idx <= b){
                    ansArr.add(num_list[idx]);
                    idx ++;
                }
                break;
            case 4:
                idx = a;
                while(idx <= b){
                    ansArr.add(num_list[idx]);
                    idx += c;
                }
                break;
        }
        
        int[] answer = new int[ansArr.size()];
        for(int i = 0; i < ansArr.size(); i++){
            answer[i] = ansArr.get(i);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int idx = 0;
        int check = 0;
        ArrayList<String> temp = new ArrayList<>();
        
        while(check == 0 && idx < str_list.length){
            if(str_list[idx].equals("l")){
                for(int i = 0; i < idx; i++){
                    temp.add(str_list[i]);
                }
                check = 1;
            } else if(str_list[idx].equals("r")){
                for(int j = 0; j < str_list.length - idx - 1; j++){
                    temp.add(str_list[j + idx + 1]);
                }
                check = 1;
            } else {
                idx++;
            }
        }
        
        String[] answer = new String[temp.size()];
        for(int l = 0; l < temp.size(); l++){
            answer[l] = temp.get(l);
        }
        
        return answer;
    }
}
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                al.add((int) my_string.charAt(i) - 48);
            }
        }
        
        int size = al.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
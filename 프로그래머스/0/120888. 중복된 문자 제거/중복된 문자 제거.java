import java.util.ArrayList;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        ArrayList<String> al = new ArrayList<>();
        
        for(String a : arr){
            if(!al.contains(a)){
                al.add(a);
                answer += a;
            }
        }
        
        return answer;
    }
}
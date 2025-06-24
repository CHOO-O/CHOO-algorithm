import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int cnt = 0;
        for(String[] p : photo){
            int total = 0;
            for(int i = 0; i < p.length; i++){
                Integer score = map.get(p[i]);
                if(score != null){
                    total += score;  
                }
            }
            answer[cnt] = total;
            cnt++;
        }
        
        return answer;
    }
}
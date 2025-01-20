class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0;
        int ycnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.toLowerCase().charAt(i);
            if(c == 'p'){
                pcnt++;
            } else if(c == 'y'){
                ycnt++;
            }
        }
        
        if(pcnt == ycnt){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}
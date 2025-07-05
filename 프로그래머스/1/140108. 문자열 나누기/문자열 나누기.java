class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while(true){
            int same = 1;
            int diff = 0;
            char first = s.charAt(0);
            int len = s.length();
            
            for(int i = 1; i < len; i++){
                if(s.charAt(i) == first){
                    same++;
                } else {
                    diff++;
                }
                
                if(same == diff){
                    s = s.substring(i + 1);
                    answer++;
                    break;
                }
            }
            
            if(s.length() == 0){
                break;
            } else if(same + diff == len){
                answer++;
                break;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] split = s.split("");
        int idx = 0;
        
        for(int i = 0; i < split.length; i++){
            String temp = "";
            if(split[i].equals(" ")){
                idx = 0;
                answer += " ";
            } else {
                if(idx%2 == 0){
                    temp = split[i].toUpperCase();
                    answer += temp;
                } else {
                    temp = split[i].toLowerCase();
                    answer += temp;
                }
                idx ++;
            }
        }

        return answer;
    }
}
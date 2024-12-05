class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] temp = quiz[i].split(" ");
            int t = 0;
            switch(temp[1]){
                case "+":
                    t = Integer.valueOf(temp[0]) + Integer.valueOf(temp[2]);
                    break;
                case "-":
                    t = Integer.valueOf(temp[0]) - Integer.valueOf(temp[2]);
                    break;
            }
            
            if(t == Integer.valueOf(temp[4])){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
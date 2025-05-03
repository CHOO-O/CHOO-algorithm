class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int numOfZero = 0;
        
        if(s.length() == 1){
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }

        StringBuilder removeZero = new StringBuilder();
        int test = 0;
        String now = s;
        
        while(true){
            convertCount++;
            for(int i = 0; i < now.length(); i++){
                 if(now.charAt(i) == '1'){
                    removeZero.append(now.charAt(i)); 
                 } else {
                     numOfZero ++;
                 }
            }
            
            String converted = Integer.toString(removeZero.toString().length(), 2);
            now = converted;
            removeZero = new StringBuilder();
            
            if(converted.equals("1")){
                answer[0] = convertCount;
                answer[1] = numOfZero;
                return answer;
            } else {
                now = converted;
                removeZero = new StringBuilder();
            }
        }

    }
}
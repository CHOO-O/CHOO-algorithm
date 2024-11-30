class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tempC = 't';
        int tempI = 0;
        
        if(num1 > num2){
            tempI = num1;
            num1 = num2;
            num2 = tempI;
        }
        
        for(int i = 0; i < my_string.length(); i++){
            if(i == num1){
                tempC = my_string.charAt(i);
                answer += "T";
            } else if(i == num2){
                answer += tempC;
            } else {
                answer += my_string.charAt(i);    
            } 
        }
        
        answer = answer.replace("T", String.valueOf(my_string.charAt(num2)));
        
        return answer;
    }
}
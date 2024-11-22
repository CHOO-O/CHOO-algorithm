class Solution {
    public String solution(int age) {
        String answer = "";

        String[] splitAge = String.valueOf(age).split("");
        
        for(int i = 0; i < splitAge.length; i++){
            answer += (char) (Integer.valueOf(splitAge[i]) + 97); 
        }
        
        return answer;
    }
}
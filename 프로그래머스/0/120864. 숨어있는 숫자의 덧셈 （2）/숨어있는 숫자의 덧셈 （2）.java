class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.split("[^0-9]+");
        
        for(String n : num){
            if(!n.equals("")){
                answer += Integer.valueOf(n);
            }         
        }

        return answer;
    }
}
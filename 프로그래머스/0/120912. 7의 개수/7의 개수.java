class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int a : array){
            String[] temp = (String.valueOf(a)).split("");
            for(String t : temp){
                if(t.equals("7")){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
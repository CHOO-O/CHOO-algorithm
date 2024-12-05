class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = Integer.valueOf(s[0]);
        int idx = 1;
        int temp = 0;
        while(idx <= s.length - 1){
            if(s[idx].equals("+")){
                temp = 1;
                idx++;
            } else if(s[idx].equals("-")){
                temp = 0;
                idx++;
            } else {
                if(temp == 1){
                    answer += Integer.valueOf(s[idx]);
                    idx++;
                } else {
                    answer -= Integer.valueOf(s[idx]);
                    idx++;
                }
            }
        }
  
        return answer;
    }
}
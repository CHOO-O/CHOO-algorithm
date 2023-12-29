class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String cut = my_string.substring(s, e+1);
        String reverse = "";
        int length = cut.length();

        for(int i = length; i > 0; i--){
            // System.out.println(cut.substring(i-1,i));
            String temp = cut.substring(i - 1, i);
            reverse += temp;
        }
        
        answer = my_string.replace(cut, reverse);
        
        return answer;
    }
}
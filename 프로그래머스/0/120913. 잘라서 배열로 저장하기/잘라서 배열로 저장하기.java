class Solution {
    public String[] solution(String my_str, int n) {
        int l = 0;
        if(my_str.length()%n == 0){
            l = my_str.length()/n;
        } else {
            l = my_str.length()/n + 1;
        }
        String[] answer = new String[l];
        String temp = "";
        int i = 0;
        int idx = 0;
        
        while(idx < l){
            if(l - 1 == idx){
                temp = my_str.substring(i, my_str.length());
                answer[idx] = temp;
            } else {
                temp = my_str.substring(i, i+n);
                i += n;
                answer[idx] = temp;
            }
            idx++;
        }        
        
        
        return answer;
    }
}
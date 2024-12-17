class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;
        
        String[] poly = polynomial.split(" ");
        for(String p : poly){
            if(p.contains("x")){
                if(p.length() == 1){
                    a ++;
                } else {
                    a += Integer.valueOf(p.substring(0, p.length() - 1));
                }
            } else if(p.equals("+")){
                continue;
            } else {
                b += Integer.valueOf(p);
            }
        }
        
        if(a != 0 && b != 0){
            if(a == 1){
                answer = "x + " + b;
            } else {
                answer = a + "x + " + b;
            }
        } else if(a != 0 && b == 0){
            if(a == 1){
                answer = "x";
            } else {
                answer = a + "x";
            }
        } else {
            answer = String.valueOf(b);
        }
        
        return answer;
    }
}
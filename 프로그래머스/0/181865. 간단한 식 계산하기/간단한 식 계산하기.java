class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] spl = binomial.split(" ");
        int a = Integer.parseInt(spl[0]);
        int b = Integer.parseInt(spl[2]);
        char op = spl[1].charAt(0);
        
        if(op == '+'){
            answer = a + b;
        } else if (op == '-'){
            answer = a - b;
        } else {
            answer = a*b;
        }
        
        return answer;
    }
}
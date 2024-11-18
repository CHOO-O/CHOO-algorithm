class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = numer1*denom2 + numer2*denom1; // 분자
        int denom3 = denom1*denom2; // 분모
        
        int a, b = 0;
        if(numer3 >= denom3){
            a = numer3;
            b = denom3;
        } else {
            a = denom3;
            b = numer3;
        }
        
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        answer[0] = numer3/a;
        answer[1] = denom3/a;
        
        return answer;
    }
}
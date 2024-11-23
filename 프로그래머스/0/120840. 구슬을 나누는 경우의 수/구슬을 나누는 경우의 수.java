import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.ONE;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        int n = balls;
        int m = share;
        int l = balls - share;
        
        while(n >= 1){
            a = a.multiply(BigInteger.valueOf(n));
            n--;
        }
        
        while(m >= 1){
            b = b.multiply(BigInteger.valueOf(m));
            m--;
        }
        
        while(l >= 1){
            c = c.multiply(BigInteger.valueOf(l));
            l--;
        }
        
        answer = a.divide(b.multiply(c));
        
        return answer.intValue();
    }
}
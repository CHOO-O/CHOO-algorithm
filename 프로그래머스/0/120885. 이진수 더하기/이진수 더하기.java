import java.math.BigInteger;

class Solution {
    public String solution(String bin1, String bin2) {
        BigInteger bi1 = new BigInteger(bin1, 2);
        BigInteger bi2 = new BigInteger(bin2, 2);
        BigInteger sum = bi1.add(bi2);
        String answer = sum.toString(2);
        
        return answer;
    }
}
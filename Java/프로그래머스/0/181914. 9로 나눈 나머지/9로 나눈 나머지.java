import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger bi = new BigInteger(number);
        BigInteger nine = new BigInteger("9");
        BigInteger result = bi.mod(nine);
        
        return result.intValue();
    }
}
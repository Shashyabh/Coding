package BossCoder.BitManipulation;

import java.math.BigInteger;

public class NoOf1Bit {
    public static void main(String[] args) {
        String s="00000000000000000000000000001011";
        BigInteger number = new BigInteger(s,2);;
        int num = number.intValue();
        long n=number.longValue();
        int count=0;
        while(num!=0){
            num=(num&(num-1));
            count++;
        }

        System.out.println(count);
    }
}

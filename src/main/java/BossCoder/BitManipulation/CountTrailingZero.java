package BossCoder.BitManipulation;

import java.util.BitSet;

public class CountTrailingZero {
    public static void main(String[] args) {
        int n=12;
        BitSet bitSet=BitSet.valueOf(new long[]{n});
        //System.out.println(bitSet);
        for (int i = 0; i < 64; i++) {
            System.out.println(bitSet.get(i));
        }
    }
}

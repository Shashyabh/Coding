package BossCoder.Array;

import java.util.Arrays;
import java.util.List;

public class ReverseChunkOfArray {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,3,4,5,6,7,8,9,12,14,3);
        reverseInGroups(list,9,4);
        System.out.println(list.toString());
    }
    static void reverseInGroups(List<Integer> list, int n, int k) {

        for(int i=0;i<n;i+=k){
            int low=i;
            int high=i+k-1;
            if(high>n-1){
                high=n-1;
            }
            while(low<high){
                int temp = list.get(low);
                list.set(low, list.get(high));
                list.set(high, temp);
                low++;
                high--;

            }
        }
    }
}

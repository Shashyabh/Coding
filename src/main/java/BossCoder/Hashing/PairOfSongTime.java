package BossCoder.Hashing;

import java.util.HashMap;

public class PairOfSongTime {
    public static void main(String[] args) {
        int nums[]={30,20,150,100,40,220};
        System.out.println(numPairsDivisibleBy60(nums));
    }
    public static int numPairsDivisibleBy60(int[] time) {
        int total=0;
        int n=time.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int rem=time[i]%60;
            int target=60-rem;

            if(map.containsKey(target)){
                total+=map.get(target);
            }
            if(rem != 0)
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            else
                map.put(60, map.getOrDefault(60, 0) + 1);
        }
        return total;
    }
}

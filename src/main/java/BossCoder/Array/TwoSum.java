package BossCoder.Array;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int arr[]={2,7,4,6,8,12};
        int target=16;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int restSum=target-arr[i];

            if(map.containsKey(arr[i])){
                System.out.println(arr[i]+" "+map.get(arr[i]));
            }
            else{
                map.put(restSum,arr[i]);
            }
        }
    }
}

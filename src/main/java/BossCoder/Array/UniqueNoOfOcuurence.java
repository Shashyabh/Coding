package BossCoder.Array;

import java.util.HashSet;

public class UniqueNoOfOcuurence {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        System.out.println(f(arr));
    }

    public  static  boolean f(int []arr){
        int  [] nums=new int[2001];
        HashSet<Integer> set=new HashSet<>();

        for(int a:arr){
            nums[1000+a]++;
        }

        for (int a:nums){
            if(a!=0){
                System.out.print(a+" ");
            }
        }

        for(int a:nums){
            if(a!=0){
                if(set.contains(a)){
                    return false;
                }
                else{
                    set.add(a);
                }
            }
        }
        System.out.println(set);
        return true;
    }
}

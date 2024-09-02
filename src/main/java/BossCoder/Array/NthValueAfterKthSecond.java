package BossCoder.Array;

import java.util.Arrays;

public class NthValueAfterKthSecond {
    public static void main(String[] args) {
        int n=5;
        int k=1000;
        int mod=1000000007;

        int arr[]=new int[n];
        int ans[]=new int[n];

//        Second	State After
//        0	[1,1,1,1]
//        1	[1,2,3,4]
//        2	[1,3,6,10]
//        3	[1,4,10,20]
//        4	[1,5,15,35]
//        5	[1,6,21,56]
        Arrays.fill(arr,1);
        while(k>0){
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
                ans[i]=sum;
            }
            System.out.println(ans[n-1]);
            arr=ans;
            k--;
        }

        System.out.println(ans[n-1]);
    }
}

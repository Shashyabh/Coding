package BossCoder.Recursion.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubsets {
    public static void main(String[] args) {
        int arr[]={1,2,4};
        //1,2,4,12,14,24,124
        List<Integer> ans=new ArrayList<>();
        f(arr,ans,0,0);
        System.out.println(ans);
    }

    public static void f(int []arr,List<Integer> ans,int i,int total){
        if(i==arr.length){
            ans.add(total);
            return;
        }
        f(arr,ans,i+1,total+arr[i]);
        f(arr,ans,i+1,total);
    }
}

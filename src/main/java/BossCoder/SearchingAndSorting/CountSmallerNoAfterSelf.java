package BossCoder.SearchingAndSorting;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNoAfterSelf {
    public static void main(String[] args) {
        int nums[]={5,2,6,1};
        System.out.println(countSmaller(nums));
    }
        static class Pair{
            int val,idx,smaller;
            public Pair(int val,int idx){
                this.val = val;
                this.idx = idx;
                smaller = 0;
            }
        }

    public static List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        List<Integer> ANS = new ArrayList<>();
        int[] ans = new int[n];
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }
        mergeSort(arr, 0, n - 1);
        for (Pair P : arr) {
            ans[P.idx] = P.smaller;
        }

        for (int i = 0; i < n; i++) {
            ANS.add(ans[i]);
        }
        return ANS;
    }

        public static void mergeSort(Pair[] arr,int low ,int high){
            if(low<high){
                int mid = low + (high-low)/2;
                mergeSort(arr,low,mid);
                mergeSort(arr,mid+1,high);
                merge(arr,low,mid,high);
            }
        }

        public static void merge(Pair[] arr,int low,int mid,int high){

            ArrayList<Pair> A = new ArrayList<>();
            int i = low ;
            int j = mid+1;
            while(i<=mid && j<=high){
                if(arr[i].val<=arr[j].val){
                    arr[i].smaller+=j-mid-1;
                    A.add(arr[i]);
                    i++;
                }else{
                    A.add(arr[j]);
                    j++;
                }
            }

            while(i<=mid){
                arr[i].smaller += j-mid-1;
                A.add(arr[i]);
                i++;
            }

            while(j<=high){
                A.add(arr[j]);
                j++;
            }
            int idx = 0;
            for(int k = low; k<=high;k++,idx++){
                arr[k] = A.get(idx);
            }
        }

}

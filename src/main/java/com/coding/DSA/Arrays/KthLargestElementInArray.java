package com.coding.DSA.Arrays;


import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[]nums={3,2,1,5,6,4};//{3,2,3,1,2,4,5,5,6};//1,2,2,3,3,4,5,5,6
        int k=2;
        largestElement(nums,k);
    }

    private static void largestElement(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int a:nums){
            pq.add(a);
        }
        //5=5-

        while (pq.size()!= k){
            pq.poll();
        }
        System.out.println(pq.peek());

    }

//    Input: [3,2,3,1,2,4,5,5,6], k = 4
//    Output: 4
}

//class KthLargestElementInArray {
//    public static boolean countElement(int mid , int number , int nums[]) {
//        int count = 0;
//        for(int i = 0; i < nums.length ; i++) {
//            if(mid > nums[i]) {
//                count++;
//            }
//        }
//        if(count <= number) return true;
//        else return false;
//    }
//
//    public static int findKthLargest(int[] nums, int k) {
//        int n = nums.length;
//        int number = n-k;
//        int start = Integer.MAX_VALUE;   //min element of array
//        int end = Integer.MIN_VALUE;	//max element of array
//        int ans = 0;
//        for(int i = 0 ; i < nums.length ;i++) {
//            if(nums[i] < start) start = nums[i];
//            if(nums[i] > end) end = nums[i];
//        }
//
//        int mid = 0;
//        while(start <= end) {
//            mid = start + ((end-start)/2);
//
//            if(countElement(mid,number,nums)) {
//                ans = mid;
//                start = mid+1;
//
//            }else {
//                end = mid - 1;
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int[]nums={3,2,3,1,2,4,5,5,6};
//        System.out.println(findKthLargest(nums,4));
//    }
//}

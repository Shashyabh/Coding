package com.coding.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int [nums1.length];
        Queue<Integer> st=new LinkedList<>();
        int k=0;
        boolean flag=true;

        for(int i=0;i<nums1.length;i++){
            st.clear();
            for(int a:nums2){
                st.add(a);
            }
            while(st.peek()!=nums1[i]){
                st.remove();
            }
            st.remove();
            //System.out.print(st.peek());
            if(st.isEmpty()){
                ans[k]=-1;
                k++;
            }
            else{
                while(true){
                    flag=true;
                    int x=st.remove();
                    if(nums1[i]<x){
                        ans[k]=x;
                        k++;
                        flag=false;
                        break;
                    }
                    if(st.isEmpty()){
                        break;
                    }
                }
                if(flag==true){
                    ans[k]=-1;
                    k++;
                }
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums1={2,1,3};
        int[] nums2={2,3,1};
        int [] result=nextGreaterElement(nums1,nums2);
        for(int m:result){
            System.out.println(m);
        }
    }
}

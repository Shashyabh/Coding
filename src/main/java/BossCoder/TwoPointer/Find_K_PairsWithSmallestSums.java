package BossCoder.TwoPointer;

import java.util.*;

public class Find_K_PairsWithSmallestSums {
    public static void main(String[] args) {
        int nums1[]={1,1,2};
        int nums2[]={1,2,3};
        System.out.println(kSmallestPairs(nums1,nums2,2));
    }

     static class Pair{
        int x;
        int y;
        int sum;
        Pair(int x,int y,int sum){
            this.x=x;
            this.y=y;
            this.sum=sum;
        }
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(p->p.sum));

        int l1 = nums1.length, l2 = nums2.length;
        for(int i=0; i<l1; i++) {
            for(int j=0; j<l2; j++) {
                Pair pair = new Pair(nums1[i],nums2[j],nums1[i] + nums2[j]);
                pq.add(pair);
            }
        }

        while(!pq.isEmpty() && k-->0) {
            List<Integer> list = new ArrayList<Integer>();
            Pair p=pq.poll();
            list.add(p.x);
            list.add(p.y);
            ans.add(list);
        }
        return ans;
    }
}

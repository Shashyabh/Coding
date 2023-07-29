package com.coding.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int intervals[][]={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [][]intvl={{0 ,73},{74, 74},{77 ,77},{81 ,117}, {159 ,163},{246, 262}};
        int [] newInterval={42,86};

//        Arrays.sort(intervals,Comparator.comparingDouble(o->o[1]));
        int[][]ans=insert(intvl,newInterval);
        for (int[]a:ans){
            System.out.print(Arrays.toString(a));
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();
        //{{1,2},{3,5},{6,7},{8,10},{12,16}};

        for(int[] in:intervals){
            if(in[1]<newInterval[0]){
                ans.add(in);
            }
            else if(in[0]>newInterval[1]){
                ans.add(newInterval);
                newInterval=in;
            }
            else{
                newInterval[0]=Math.min(in[0],newInterval[0]);
                newInterval[1]=Math.max(in[1],newInterval[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}

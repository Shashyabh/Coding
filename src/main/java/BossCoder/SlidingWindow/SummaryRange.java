package BossCoder.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();

        int n=nums.length;
        int i=0;
        int j=0;

        while(j<n){
            if(j<n-1 && nums[j+1]-nums[j]==1){
                j++;
            }
            else{
                if(i==j){
                    ans.add(Integer.toString(nums[j]));
                }
                else{
                    ans.add(Integer.toString(nums[i])+"->"+Integer.toString(nums[j]));
                }
                i=j+1;
                j++;
            }

        }

        return ans;
    }
}

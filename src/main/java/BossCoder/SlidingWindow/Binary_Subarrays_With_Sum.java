package BossCoder.SlidingWindow;

public class Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        int nums[]={0,0,0,0,0,0,1,0,0,0};
        int goal=0;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {

        int count = 0;
        int n = nums.length;
        int sum = 0;
        int i = 0;
        int j = 0;
        int prefZero = 0;
        while (j < n) {
            sum += nums[j];
            while (i < j && (nums[i] == 0 ||  sum > goal)) {
                if (nums[i] == 0) {
                    prefZero++;
                } else {
                    prefZero = 0;
                }
                sum = sum - nums[i];
                i++;
            }
            if (sum == goal) {
                count = count + 1 + prefZero;
            }
            j++;
        }
        return count;
    }
}

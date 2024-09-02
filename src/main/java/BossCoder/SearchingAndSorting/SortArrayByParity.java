package BossCoder.SearchingAndSorting;

public class SortArrayByParity {
    public static void main(String[] args) {
        int nums[]={4,1,2,4,3,3,3,3,3,4};
        int num[]=sortArrayByParity(nums);
        for(int a:num){
            System.out.print(a+" ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {

        int n=nums.length;
        int i=0;
        int j=n-1;

        while(i<=j){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if(nums[i]%2==0){
                i++;
            }
            else{
                j--;
            }
        }

        return nums;
    }
}

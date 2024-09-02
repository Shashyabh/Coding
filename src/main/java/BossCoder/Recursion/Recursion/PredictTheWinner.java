package BossCoder.Recursion.Recursion;

public class PredictTheWinner {
    public static void main(String[] args) {
        int []nums={1,5,9,2};

        System.out.println(f(nums,0,nums.length-1)>=0?"One is winner":"Two is winner");
    }

    public static int f(int nums[],int i,int j){
        if(i==j){
            return nums[i];
        }

        int left=nums[i]-f(nums,i+1,j);
        int right=nums[j]-f(nums,i,j-1);

        return Math.max(left,right);
    }
}

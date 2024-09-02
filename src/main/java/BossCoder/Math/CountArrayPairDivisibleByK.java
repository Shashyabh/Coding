package BossCoder.Math;

public class CountArrayPairDivisibleByK {
    public static void main(String[] args) {
        int nums[]={8,10,2,5,9,6,3,8,2};
        int k=6;
        //(0, 1), (0, 3), (1, 2), (1, 3), (1, 4), (2, 3), and (3, 4).

        int mod[]=new int [k];
        int total=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                count++;
                total+=n-count;
            }
        }

        System.out.println(total);
    }
}

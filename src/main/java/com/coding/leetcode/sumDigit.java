package com.coding.leetcode;

class sumDigit {
    public static void main(String[] args) {
        int [] nums={1234,3441,124,1456,122113,45443};
        evenDigit(nums);
    }

    private static void evenDigit(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int num2=nums[i];
            int count=0;
            while(num2>0){
                num2=num2/10;
                count++;
            }
            if(count%2==0)
            {
                total++;
            }

        }
        System.out.println("Total digit = "+ total);
    }

}

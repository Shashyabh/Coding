package com.coding.DSA.RESTALL;

public class DiceCombinationSumByRecursion {
    public static void main(String[] args) {
        combination("",4);
    }

    static void combination(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            combination(i+p,target-i);
        }
    }
}

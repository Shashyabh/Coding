package com.coding.PatternPrinting;

public class Pattern5 {
    public static void main(String[] args) {

        int n=4;
        for(int row=0;row<2*n;row++){
            int totalCol=row>n ? n-(row-n):row;/// totalCol= n- space;
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


//        for(int i=0;i<9;i++){
//            if(i<=4){
//                for(int j=0;j<=i;j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else{
//                for(int j=8-i+1;j>0;j--){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
    }
}

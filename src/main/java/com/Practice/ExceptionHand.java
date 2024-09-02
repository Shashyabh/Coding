package com.Practice;

public class ExceptionHand {

    public static void main(String[] args)  {
        int x[]={10,10,10};
        f(x);
        System.out.println(x[0]);
    }


    public static int[] f(int x[]){
//        System.out.println(1+2+"a"+"b"+3+4+"abc");
//        System.out.println('a');//a
//        System.out.println('a'+3);
//        System.out.println('a'+'b');//195
//        System.out.println('a'+"sha");//asha
//        System.out.println('a'+'b'+"sha");//195sha
//        System.out.println("sha"+'s'+'h');//shash
        x[0]=50;
        return x;
    }
}

package com.AdvJava.MutliThreading.OddEvenPrintingByTwoThread;

public class Main {
    public static void main(String[] args) {
        Counting c=new Counting(10);
        EvenThread e=new EvenThread(c);
        OddThread o=new OddThread(c);
        Thread t1=new Thread(e);
        Thread t2=new Thread(o);
        t1.start();
        t2.start();
    }
}

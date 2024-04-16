package com.AdvJava.MutliThreading.OddEvenPrintingByTwoThread;

public class OddThread implements Runnable{
    Counting c;
    OddThread (Counting c){
        this.c=c;
    }
    @Override
    public void run() {
        for (int i=1;i<=c.count;i++){
            c.odd();
        }
    }
}

package com.AdvJava.MutliThreading.OddEvenPrintingByTwoThread;

public class EvenThread implements Runnable{
    Counting c;
    EvenThread (Counting c){
        this.c=c;
    }
    @Override
    public void run() {
        for (int i=1;i<=c.count;i++){
            c.even();
        }
    }
}

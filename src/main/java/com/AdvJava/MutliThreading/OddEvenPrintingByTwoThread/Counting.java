package com.AdvJava.MutliThreading.OddEvenPrintingByTwoThread;

public class Counting {
    public int count;
    int i=1;
    public Counting(int count){
        this.count=count;
    }

    public synchronized void even(){
        if(i%2!=0){
            try{
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return;
        }
        Thread.currentThread().setName("Even thread");
        System.out.println(Thread.currentThread().getName() +" " +i);
        i++;
        notify();
    }

    public synchronized void odd(){
        if(i%2==0){
            try{
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return;
        }
        Thread.currentThread().setName("Odd thread");
        System.out.println(Thread.currentThread().getName() +" " +i);
        i++;
        notify();
    }
}

package com.AdvJava.MutliThreading;

public class Counting  extends Thread{
    private final int startValue;
    public Counting(int startValue) {
        this.startValue = startValue;
    }

    @Override
    public void run() {
        printNumber();
    }

    private static final Object lock=new Object();
    private static final int maxCount=10;
    private static int count=1;

    public void printNumber(){
        synchronized (lock){
            while (count<=maxCount){
                if(count%2==startValue){
                    if (count%2==0){
                        Thread.currentThread().setName("Even Thread");
                    }
                    else{
                        Thread.currentThread().setName("Odd Thread");
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;
                    lock.notify();
                }
                else{
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Counting c=new Counting(1);
        c.start();
        Counting c1=new Counting(0);
        c1.start();
    }
}



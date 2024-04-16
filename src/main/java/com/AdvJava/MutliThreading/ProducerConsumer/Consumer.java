package com.AdvJava.MutliThreading.ProducerConsumer;

public class Consumer implements Runnable{

    Company c;
    Consumer(Company c){
        this.c=c;
    }
    @Override
    public void run() {
        while (true){
            this.c.consumeItem();
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

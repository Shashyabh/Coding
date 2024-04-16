package com.AdvJava.MutliThreading.ProducerConsumer;

public class Producer implements Runnable{

    Company c;
    Producer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        int i=1;

        while (true){
            this.c.produceItem(i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
